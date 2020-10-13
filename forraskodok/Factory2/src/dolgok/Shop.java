package dolgok;
import dolgok.Piano;
import dolgok.Guitar;
import dolgok.Instrument;

public class Shop {

    public static Instrument getPurchase(String purcashe){
        if(purcashe == "guitar")
            return new Guitar("Electric","Fender");
        else if (purcashe == "piano")
            return new Piano("Keyboard","Roland");
        return null;
    }

    public static void main(String[] args) {
        Instrument telecaster = getPurchase("guitar");
        Instrument casio = getPurchase("piano");

        System.out.println(telecaster.toString());
        System.out.println(casio.toString());
    }
}
