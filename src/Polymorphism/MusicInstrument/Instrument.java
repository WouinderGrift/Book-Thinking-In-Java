package Polymorphism.MusicInstrument;

/**
 * Восходящим преобразованием называют интерпретацию ссылки на объект как ссылки на базовый тип.
 *
 * Метод Music.tune получает ссылку на Instrument, но и последняя тоже может указывать
 * на объект любого класса, производного от Instrument. Восходящее преобразование от Wind
 * k Instrument способно сузить этот интерфейс, но не сделает его меньше, чем полный интерфейс класса.
 */

enum Note{
    MIDDLE_C;
}

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

