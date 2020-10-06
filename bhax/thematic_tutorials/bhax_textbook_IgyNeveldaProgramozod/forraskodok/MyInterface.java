public interface MyInterface {

    //Működik, hiszen statikus metódusnak van body-ja
    static String name(){
        String name = "Reka";
        return name;
    }

    //nem működik, mivel nincs body
    static String anotherName();
}
