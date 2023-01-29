package Chapter_12;


public class EnumMethodsDemo {

    // ������ ����������, ����� �� ���� ��������� ������������ ���
    enum Transports {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void main(String args[]) {

        Transports tp;
        Transports tps[];

        tp = Transports.valueOf("TRAIN");
        System.out.println("�������� tp: " + tp);

        // ������ ������, ������ ���������� ��� �������� �������
        System.out.print("������������ Transports ��������:");
        tps = Transports.values();
        for (Transports x : tps)
            System.out.print(" " + x);

        // ������ ������, �������� �������� � ��������
        System.out.println("\n������������ Transports ��������:");
        for (Transports t : Transports.values())
            System.out.println(t);
    }
}
