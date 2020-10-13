package app;

import builders.ManualBuilder;
import others.Director;
import others.Guitar;
import builders.GuitarBuilder;
import others.Manual;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        GuitarBuilder builder = new GuitarBuilder();

        director.makeElectricGtr(builder);
        Guitar guitar = builder.getResult();
        System.out.println("\nGuitar built:\n" + guitar.getType() + guitar.getBrand() + "\n");

        ManualBuilder manualBuilder = new ManualBuilder();
        director.makeElectricGtr(manualBuilder);
        Manual guitarManual = manualBuilder.getResult();
        System.out.println("Guitar manual:\n" + guitarManual.print());
    }
}
