package PolymorphismDemo;

public class UpDownCastingDemo {
    // Upcasting или восходящее преобразование:
    Car1 car1 = new MiniCar1(); // является безопасным
    Car1 car11 = car1; // также допустимо

    // Downcasting или нисходящее преобразование
    MiniCar1 miniCar1 = (MiniCar1) car11;

    // Пример почему это может быть небезопасно:
    Car1 supercar = new Car1();
    MiniCar1 ss = (MiniCar1) supercar;

    public static void main(String[] args) {
        UpDownCastingDemo udcd = new UpDownCastingDemo();
        // При запуске программы мы получим ClassCastException
        udcd.ss.getWheels(); // Хотя ошибка и не показывается
    }
}
