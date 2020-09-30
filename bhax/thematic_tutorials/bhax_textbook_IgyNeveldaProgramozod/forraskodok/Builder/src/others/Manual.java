package others;

public class Manual {
    private Type type;
    private Brand brand;
    private Strings strings;
    private Killswitch killswitch;
    private Amp amp;

    public Manual(Type type, Brand brand, Strings strings, Killswitch killswitch, Amp amp){
        this.type = type;
        this.brand = brand;
        this.strings = strings;
        this.killswitch = killswitch;
        this.amp = amp;
    }

    public String print(){
        String manual ="";
        manual +=  "Type:" + type + "\n";
        manual +=  "Brand:" + brand + "\n";
        manual +=  "Strings:" + strings + "\n";

        if (this.killswitch != null){
            manual += "With killswitch" + "\n";
        }
        else{
            manual += "Without killswitch" + "\n";
        }

        if(this.amp != null){
            manual += "With amp" + "\n";
        }
        else{
            manual += "Without amp" + "\n";
        }

        return manual;
    }
}
