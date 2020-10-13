package dolgok;

public class Instrument {
    public String type;
    public String brand;

    public Instrument(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
