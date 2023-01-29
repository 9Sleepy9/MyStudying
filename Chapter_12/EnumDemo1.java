package Chapter_12;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
        }

public class EnumDemo1 {
    public static void main(String args[]) {

        Transport tp;
        tp = Transport.AIRPLANE;

        System.out.println("Значение tp: " + tp + "\n");

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN\n");

        switch (tp) {
            case CAR:
                System.out.println("Машина едет");
                break;
            case TRUCK:
                System.out.println("Грузовик везёт");
                break;
            case AIRPLANE:
                System.out.println("Самолёт летит");
                break;
            case TRAIN:
                System.out.println("Поезд едет");
                break;
            case BOAT:
                System.out.println("Лодка плывёт");
                break;
        }
    }
}
