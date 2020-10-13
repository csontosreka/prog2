package pickups;

import parts.Pickups;

public class GuitarPickups implements Pickups {
    @Override
    public void produce() {
        System.out.println("You have created guitar pickups");
    }
}
