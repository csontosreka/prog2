package example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GoneOrIsIt {

    private static class BugousStuffProducer {
        private final Writer writer;
        public BugousStuffProducer(String outputFileName) throws
                IOException {
            writer = new FileWriter(outputFileName);
        }
        public void writeStuff() throws IOException {
            writer.write("Stuff");
        }
        @Override
        public void finalize() throws IOException {
            writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        BugousStuffProducer bugousStuffProducer = new BugousStuffProducer("example.txt");
        bugousStuffProducer.writeStuff();
        System.gc();
    }
}
