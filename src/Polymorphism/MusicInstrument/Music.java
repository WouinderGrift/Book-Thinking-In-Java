package Polymorphism.MusicInstrument;

import sun.rmi.transport.ObjectTable;

public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);

        Stringed st = new Stringed();
        tune(st);

        Brass br = new Brass();
        tune(br);
    }
}
