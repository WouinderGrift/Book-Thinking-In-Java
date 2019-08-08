package Polymorphism.Shape;

/**
 * Восходящее преобразование даже имеет место быть  в такой команде как
 * Shape s = new Circle();
 * На первый взгляд присвоение одного типа к другому может показаться ошибкой, но так как
 * тип окружность является типом фигура посредством наследования, то все нормально.
 *
 * s.draw();
 * Можно подумать, что вызывается метод Shape.draw(); раз имеется ссылка на объект shapeю
 * Но будет вызван правильный метод Circle.draw(); так как используется позднее связывание.
 *
 * Базовый класс ФИГУРА устанавливает общий интерфейс для всех классов, производных от ФИГУРЫ.
 *
 */

public class CallShapes{
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }

        for(Shape shp : s){
            shp.draw();
        }

    }
}
