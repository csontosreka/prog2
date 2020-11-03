package example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GoneOrIsItFixed {
    private static class BugousStuffProducer implements AutoCloseable {
        private final Writer writer;

        public BugousStuffProducer(String outputFileName) throws
                IOException {
            writer = new FileWriter(outputFileName);
        }
        public void writeStuff() throws IOException {
            writer.write("Stuff");
        }

        @Override
        public void close() throws Exception {
            writer.close();
        }
    }

    public static void main(String[] args) throws Exception {
        try(BugousStuffProducer bugousStuffProducer = new BugousStuffProducer("fixedExample.txt")){
            bugousStuffProducer.writeStuff();
        }
    }
}
