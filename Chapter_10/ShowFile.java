package Chapter_10;

import java.io.*;

public class ShowFile {

    public static void main(String[] args) {

        int i; // ��� ������ ������ �� �����
        FileInputStream fis = null; // ����� ����� ��������� ������� ���� (��������, ������)

        // ���������, �������� �� �� ������ �� ���� ��� ���� �����-�� ������� ��������
        // (����� ������ - ����� �����������, ��������� ���� � ����� �������)
        if (args.length != 1) {
            System.out.println("��������� ������� ����");
            return; // ���� ������ �� ��������, �� ������� �� ������ main()
        }

        try {
            fis = new FileInputStream(args[0]); // ������� ������ �� ���� ������������ ������ FileInputStream,
                                                // ����� ���� ������ �� ��������������� ������ � ���������� fis

            do {
                i = fis.read(); // ��������� ���� ���� �� �����
                if ( i != -1 ) // ���� �� ��������� ����� �����
                    System.out.print( (char) i ); // ������� ������, ������� � �������� ���� ������ �������� � i
            } while (i != -1); // ���� ���� �� ����������
        }
        // ��������� ����������
        catch (FileNotFoundException exc) { // ���� ������� ������� ������ �� ����
            System.out.println("������! ���� �� ������");
        }
        catch (IOException exc) { // ���� ��������� ������ ��� ������
            System.out.println("������ ��� ������ �����");
        }

        /*
            �����, ����� ��������� ��������� ���������� ��:
                ...
                }
                catch (IOException exc) {
                    System.out.println("������ �����-������ " + exc);
                }
                finally
                ...
         */

        finally { // ������� ���� ����� � ����� ������

            try {
                if (fis != null) fis.close(); // ���� ���� ��� ������, �� ��������� ���
            }
            catch (IOException exc) { // ������������ ��������� ������ ��� �������� �����
                System.out.println("������ ��� �������� �����");
            }

        }
    }
}
