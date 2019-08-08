package Polymorphism.ProblemOverridingPrivateMethods;

/**
 * Ошибка, переопределение закрытых методов, при подключении анотации @Override будет ошибка,
 * при сокрытие анотации выведет метод из главного класса
 */

public class PrivateOverride {
    private void f(){
        System.out.println ("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride{
   // @Override
    public void f() {
        System.out.println("public f()");
    }
}
