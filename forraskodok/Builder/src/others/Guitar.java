package others;

public class Guitar {
    private Type type;
    private Brand brand;
    private Strings strings;
    private Killswitch killswitch;
    private Amp amp;

    public Guitar(Type type, Brand brand, Strings strings, Killswitch killswitch, Amp amp){
        this.type = type;
        this.brand = brand;
        this.strings = strings;
        if (killswitch != null){
            this.killswitch = killswitch;
            this.killswitch.setGuitar(this);
        }
        if (amp != null){
            this.amp = amp;
            this.amp.setGuitar(this);
        }

    }

    public Type getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    public Strings getStrings() {
        return strings;
    }

    public Killswitch getKillswitch() {
        return killswitch;
    }

    public Amp getAmp() {
        return amp;
    }
}
