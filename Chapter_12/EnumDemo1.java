package Chapter_12;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
        }

public class EnumDemo1 {
    public static void main(String args[]) {

        Transport tp;
        tp = Transport.AIRPLANE;

        System.out.println("�������� tp: " + tp + "\n");

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp �������� TRAIN\n");

        switch (tp) {
            case CAR:
                System.out.println("������ ����");
                break;
            case TRUCK:
                System.out.println("�������� ����");
                break;
            case AIRPLANE:
                System.out.println("������ �����");
                break;
            case TRAIN:
                System.out.println("����� ����");
                break;
            case BOAT:
                System.out.println("����� �����");
                break;
        }
    }
}
