package singleton;

public final class Singleton {
    private static Singleton mayor;
    public String name;

    private Singleton(String name){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException exception){
            exception.printStackTrace();
        }

        this.name = name;
    }

    public static Singleton getMayor(String name){
        if (mayor == null){
            mayor = new Singleton(name);
        }
        return mayor;
    }

    public static void main(String[] args) {
        System.out.println("\nResult:\n");
        Singleton mayor = Singleton.getMayor("Pisti");
        Singleton mayor2 = Singleton.getMayor("Józsi");
        System.out.println(mayor.name);
        System.out.println(mayor2.name);
    }
}
