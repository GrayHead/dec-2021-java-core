package lesson3.homework.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Truba(12.4));
        instruments.add(new Drum(15));
        instruments.add(new Guitar(7));
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
        }

    }
}
