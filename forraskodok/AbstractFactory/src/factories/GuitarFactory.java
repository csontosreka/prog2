package factories;

import parts.Pickups;
import parts.Strings;
import pickups.GuitarPickups;
import strings.GuitarStrings;

public class GuitarFactory implements InstrumentFactory{
    @Override
    public Strings createStrings() {
        return new GuitarStrings();
    }

    @Override
    public Pickups createPickups() {
        return new GuitarPickups();
    }
}
