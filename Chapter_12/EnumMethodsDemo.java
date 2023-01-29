package Chapter_12;


public class EnumMethodsDemo {

    // Сделал внутренней, чтобы не было конфликта пространства имён
    enum Transports {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void main(String args[]) {

        Transports tp;
        Transports tps[];

        tp = Transports.valueOf("TRAIN");
        System.out.println("Значение tp: " + tp);

        // Первый способ, создаём переменную для хранения массива
        System.out.print("Перечисление Transports содержит:");
        tps = Transports.values();
        for (Transports x : tps)
            System.out.print(" " + x);

        // Второй способ, напрямую работаем с массивом
        System.out.println("\nПеречисление Transports содержит:");
        for (Transports t : Transports.values())
            System.out.println(t);
    }
}
