package Polymorphism.LegacyAndFinalWork;

/**
 * Уничтожение совместно используемых встроеных объектов
 * В статик лонг хранится количество созданых экземпляров Shared
 * Для счетчика вместо int - long, чтобы предотвратить переполнение.
 * поле id как final, поскольку его значение остается поостоянным на протяжении жизненного цикла объекта.
 * Присоединяя к классу общий объект, необходимо вызвать значение addRef(), но метод
 * disposeбудет следить за состоянием счетчика ссылок и сам решит, когда нужно выполнить завершающие действия.
 */

class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Create " + this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString(){
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        this.shared = shared;
        System.out.println("Create " + this);
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();

        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };

        for(Composing i: composings){
            i.dispose();
        }
    }
}
