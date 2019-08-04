package Polymorphism.MusicInstrument;

public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind play()" + n);
    }
}

class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed.play()" + n);
    }
}

class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass play()" + n);
    }
}