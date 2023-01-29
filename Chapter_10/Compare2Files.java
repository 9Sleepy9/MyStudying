package Chapter_10;

import java.io.FileInputStream;
import java.io.IOException;

public class Compare2Files {

    public static void main(String[] args) {

        int i;
        int j;
        int num = 0;

        if (args.length != 2){
            System.out.println("������! ��� ������ ���������� ������ ���� � ���� ������");
            return;
        }

        try (FileInputStream fis1 = new FileInputStream(args[0]);
            FileInputStream fis2 = new FileInputStream(args[1]))
        {
            do {
                i = fis1.read();
                j = fis2.read();
                if ( i != j && i + 32 != j && i - 32 != j ) break;
                num++;
            } while (i != -1);
            if (i != j)
                System.out.println( "����� �� ��������� " +
                        "\n���������� ������� � �������: " + num +
                        " (���� ������� � 0)" +
                        "\n��� �������: " + (char) i + " � " + (char) j );
            else
                System.out.println("����� ���������");
        }
        catch (IOException exc) {
            System.out.println("������ ��� ��������� ������: " + exc);
        }
    }
}