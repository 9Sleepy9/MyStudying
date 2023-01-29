package Chapter_12;

public class EnumDemo2 {

    enum Transport {
        CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);

        private int speed;

        Transport (int s) { speed = s; }

        int getSpeed() { return speed; }
    }

    public static void main(String args[]) {

        System.out.println("�������� �������� �������: " + Transport.AIRPLANE.getSpeed() + " ��/�\n");

        System.out.println("�������� �������� �������� ������������ �������: ");
        for ( Transport t : Transport.values() )
            System.out.println(t + ": " + t.getSpeed() + " �� � ���");

        System.out.println();

        Transport tp1, tp2, tp3;

        System.out.println("��������� ���� Transport � �� ���������� ��������: ");
        for (Transport t : Transport.values())
            System.out.println(t + " : " + t.ordinal());

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        if (tp1.compareTo(tp2) < 0)
            System.out.println(tp1 + " ��� ����� " + tp2);

        if (tp1.compareTo(tp2) > 0)
            System.out.println(tp1 + " ��� ����� " + tp2);

        if (tp1.compareTo(tp3) == 0)
            System.out.println(tp1 + " ��������� � " + tp3);
    }
}
