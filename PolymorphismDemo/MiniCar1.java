package PolymorphismDemo;

public class MiniCar1 extends Car1 {

    // Переопределяем метод в потомке
    @Override
    public int serialNumber() {
        return 10001;
    }
}
