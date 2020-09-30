package order;

import factories.BassFactory;
import factories.GuitarFactory;
import factories.InstrumentFactory;

public class Make {

    private static FactoryApp makeInstrument() {
        FactoryApp app;
        InstrumentFactory factory;

        String type = "guitar";

        if ("guitar".equals(type)) {
            factory = new GuitarFactory();
            app = new FactoryApp(factory);
        } else {
            factory = new BassFactory();
            app = new FactoryApp(factory);
        }

        return app;
    }


    public static void main(String[] args) {
        FactoryApp app = makeInstrument();
        app.produce();
    }
}
