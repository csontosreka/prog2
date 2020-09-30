package factories;

import parts.Pickups;
import parts.Strings;

public interface InstrumentFactory {
    Strings createStrings();
    Pickups createPickups();
}
