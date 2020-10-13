public class Class extends AbstractClass{
    public void print2(){
        System.out.println("Extended AbstractClass");
    }

    public static void main(String[] args) {
        Interface write = new Class();

        write.print1();
        write.print2();
    }
}
