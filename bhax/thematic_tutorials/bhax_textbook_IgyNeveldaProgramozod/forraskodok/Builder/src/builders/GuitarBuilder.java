package builders;

import others.Killswitch;
import others.Type;
import others.Brand;
import others.Strings;
import others.Amp;
import others.Guitar;

public class GuitarBuilder implements Builder{
    private Type type;
    private Brand brand;
    private Strings strings;
    private Killswitch killswitch;
    private Amp amp;

    public void setType(Type type){
        this.type = type;
    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public void setStrings(Strings strings){
        this.strings = strings;
    }

    public void setKillswitch(Killswitch killswitch){
        this.killswitch = killswitch;
    }

    public void setAmp(Amp amp){
        this.amp = amp;
    }

    public Guitar getResult(){
        return new Guitar(type, brand, strings, killswitch, amp);
    }
}
