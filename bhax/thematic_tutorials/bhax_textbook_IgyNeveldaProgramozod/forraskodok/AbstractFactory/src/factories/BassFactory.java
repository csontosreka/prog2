package factories;

import parts.Pickups;
import parts.Strings;
import pickups.BassPickups;
import strings.BassStrings;

public class BassFactory implements InstrumentFactory{
    @Override
    public Pickups createPickups() {
        return new BassPickups();
    }

    @Override
    public Strings createStrings() {
        return new BassStrings();
    }
}
