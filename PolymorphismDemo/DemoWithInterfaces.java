package PolymorphismDemo;

public class DemoWithInterfaces {

    public static void main(String[] args) {
        Car standardCar = new Car1();
        Car2 car2 = new Car2();

        System.out.println("Серийный номер: " + standardCar.serialNumber());
        // Запуск и остановка двигателя
        standardCar.start();
        standardCar.stop();

        // standardCar.getDoors(); - недопустимо, т.к. мы видим
        // только те методы, которые заданы в интерфейсе Car

        // Допустимо, т.к. экземпляр класса видит все методы
        System.out.println("Статус скоростного режима: " + car2.speedmode());

        // Пример более полезного применения полиморфизма:
        getCarSerialNumber(standardCar);
        getCarSerialNumber(car2);

        // Пример позднего связывания
        Car1 newcar1 = new MiniCar1();
        System.out.println("Серийный номер: " + newcar1.serialNumber());
    }

    // Основное преимущество полиморфизма - возможность передавать методу разные объекты
    static int getCarSerialNumber (Car car) {
        System.out.println("Машина: " + car.getName() + "; Серийный номер: " + car.serialNumber());
        return car.serialNumber();
    }
}
