package Chapter_10;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        int i;
        char [] copy = { '\n', 'C', 'o', 'p', 'y', ':', ' '};

        if (args.length != 2) {
            System.out.println("���������� ������� ��� �����!");
            return;
        }

        try (FileReader fis = new FileReader(args[0]);
                FileWriter fos = new FileWriter(args[1], true)) {
            // ��������� �����
             // true, �.�. ���������� � ����, � �� ������ �����

            fos.write(copy); // ��������� � ���� ��� ������ ��������

            // �������� �� ����� � ������� �������� fis � ���� fos
            do {
                i = fis.read();
                if (i == ' ')
                    i = '-';
                if (i != -1)
                    fos.write(i);
            } while (i != -1);

        }
        catch (IOException exc) {
            System.out.println("������ �����-������! " + exc);
        }
    }
}
