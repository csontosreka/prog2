package liskov;

public class Car extends Vehicle{
    public Car() {
        System.out.println("Car is done");
    }

    @Override
    void start() {
        System.out.println("Car is starting");
    }
}
