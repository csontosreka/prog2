package pickups;

import parts.Pickups;

public class BassPickups implements Pickups {
    @Override
    public void produce() {
        System.out.println("You have created bass pickups");
    }
}
