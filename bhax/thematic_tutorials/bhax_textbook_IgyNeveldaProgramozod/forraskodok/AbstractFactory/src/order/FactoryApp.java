package order;

import parts.Strings;
import parts.Pickups;
import factories.InstrumentFactory;
import factories.BassFactory;
import factories.GuitarFactory;

public class FactoryApp {
    public Strings strings;
    public Pickups pickups;

    public FactoryApp(InstrumentFactory factory) {
        strings = factory.createStrings();
        pickups = factory.createPickups();
    }

    public void produce() {
        strings.produce();
        pickups.produce();
    }
}



