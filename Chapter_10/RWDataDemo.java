package Chapter_10;

import java.io.*;

public class RWDataDemo {

    public static void main(String[] args) {

        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // ���������� ��������� �������� ������� ����� � ���� testdata (� ������ ���)
        try ( DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata.txt")) )
        {
            // ��������� ���� ����� ����������, �.�. �� ���������� ������� ���� ������, � �� �������!
            System.out.println("��������: " + i);
            dataOut.writeInt(i);

            System.out.println("��������: " + d);
            dataOut.writeDouble(d);

            System.out.println("��������: " + b);
            dataOut.writeBoolean(b);
        }
        catch (IOException exc) {
            System.out.println("������ �����-������: " + exc);
        }

        System.out.println();

        // ��������� ���������� �������� � ������� �� �� �������
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata.txt")))
        {
            i = dataIn.readInt();
            System.out.println("���������: " + i);

            d = dataIn.readDouble();
            System.out.println("���������: " + d);

            b = dataIn.readBoolean();
            System.out.println("���������: " + b);
        }
        catch (IOException exc) {
            System.out.println("������ �����-������: " + exc);
        }
    }
}
