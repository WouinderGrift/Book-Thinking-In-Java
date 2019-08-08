package Polymorphism.LegacyAndFinalWork;

/**
 * Пишим dispose() - метод завершающее действие
 */

class Characteristic{
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Characteristic " + s);
    }

    protected void dispose(){
        System.out.println("Завершаем Characteristic " + s);
    }
}

class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }

    protected void dispose(){
        System.out.println("Close Description " + s);
    }
}

//Живое существо
class LivingCreature {
    private Characteristic p = new Characteristic("living creature");
    private Description t = new Description("Simple living creature");

    LivingCreature(){
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("dispose() in LivingCreature");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("have heart");
    private Description t = new Description("Animal, doesn't Flora");

    Animal(){
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose in animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can living in water");
    private Description t = new Description("And in water and on earth");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose() in Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Kwakaet");
    private Description t = new Description("Eat bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Close Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Buy!");
        frog.dispose();
    }
}