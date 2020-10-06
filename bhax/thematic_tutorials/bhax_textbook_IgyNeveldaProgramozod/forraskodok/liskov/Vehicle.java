package liskov;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle is done");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args){
        Vehicle firstVehicle = new Supercar();
        firstVehicle.start();
        //létrehozunk egy új Supercart, így azon az osztályon belüli start() fog meghívódni
        System.out.println(firstVehicle instanceof Car);
        //a feltétel igaz, hiszen a firstVehicle egy Supercar, ami kiegészíti a Car-t


        Car secondVehicle = (Car) firstVehicle;
        secondVehicle.start();
        //
        System.out.println(secondVehicle instanceof Supercar);
        //

        //Supercar thirdVehicle = new Vehicle();
        //thirdVehicle.start();
    }
}
