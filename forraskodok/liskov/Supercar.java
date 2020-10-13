package liskov;

public class Supercar extends Car{
    public Supercar() {
        System.out.println("Supercar is done");
    }

    @Override
    void start() {
        System.out.println("Supercar is starting");
    }
}
