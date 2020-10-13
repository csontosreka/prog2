package builders;

import others.Type;
import others.Brand;
import others.Strings;
import others.Killswitch;
import others.Amp;

public interface Builder {
    void setType(Type type);
    void setBrand(Brand brand);
    void setStrings(Strings strings);
    void setKillswitch(Killswitch killswitch);
    void setAmp(Amp amp);
}
