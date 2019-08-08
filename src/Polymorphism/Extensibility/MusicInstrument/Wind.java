package Polymorphism.Extensibility.MusicInstrument;

public class Wind extends Instrument{
    @Override
     void play(Note n){
        System.out.println("Wind.play()" + n);
    }

    @Override
    String what(){
        return "Wind";
    }

    @Override
    void adjust(){
        System.out.println("Adjusting Wind");
    }

}

class Percussion extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Adjusting Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Stringed.play()" + n);
    }

    @Override
    String what(){
        return "Stringed";
    }

    @Override
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind{
    @Override
    public void play(Note n){
        System.out.println("Brass.play()" + n);
    }

    @Override
    void adjust(){
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind{
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}