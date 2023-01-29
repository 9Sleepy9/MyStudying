package Chapter_10;

import java.io.*;

public class RandomAccessDemo {

    public static void main(String[] args) {

        // ������ ������� ���� double �������� 8 ����
        double data[] = {19.4, 10.1, 123.54, 33, 87.9, 74.25};
        double d;

        // ������ ����� ���� � ������������� ������� rw: read + write
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            // ���������� ������ � ����
            for (int i = 0; i < data.length; i++)
                raf.writeDouble(data[i]);

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("������ ��������: " + d);

            raf.seek(8);
            d  = raf.readDouble();
            System.out.println("������ ��������: " + d);

            // ������� �������, ������ �� ����, ��� ������ �������� ������� ���� �������� 8 ����, ������� � 0,
            // �.�. ������ ����� ������� � 8-��, 16-��, 24-�� � �.�. �����
            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("�������� ��������: " + d);

            System.out.println();

            System.out.println("������ �������� � ��������� ����������� ��������: ");
            for(int i = 0; i < data.length; i+=2) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc) {
            System.out.println("������ �����-������: " + exc);
        }
    }
}
