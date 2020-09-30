package others;

import builders.Builder;

public class Director {
    public void makeElectricGtr(Builder builder){
        builder.setType(Type.ELECTRIC);
        builder.setBrand(Brand.GIBSON);
        builder.setStrings(Strings.ELECTRIC);
        builder.setKillswitch(new Killswitch());
        builder.setAmp(new Amp());
    }
    public void makeAcousticGtr(Builder builder){
        builder.setType(Type.ACOUSTIC);
        builder.setBrand(Brand.CORT);
        builder.setStrings(Strings.CLASSIC);
        builder.setKillswitch(new Killswitch());
        builder.setAmp(new Amp());
    }
    public void makeElectroAcousticGtr(Builder builder){
        builder.setType(Type.ELECTROACOUSTIC);
        builder.setBrand(Brand.FENDER);
        builder.setStrings(Strings.ACOUSTIC);
        builder.setKillswitch(new Killswitch());
        builder.setAmp(new Amp());
    }
}
