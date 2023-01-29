package Chapter_10;

import java.io.*;

// ������ ��������, � ��������, ������������ � ������� �������� ��� �� �������������������
// ��� ������� �������� ������ �������� ����������� System.in � System.out
public class ReadLines {

    public static void main(String[] args) throws IOException {

        String str;

        // ��� ����� � ������� ��������
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        // ��� ������ �� ������� ��������; ������ �������� autoFlush
        // ��������� ������� ����� ��� ������ ������ ������� ������
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("��������� ��������� ������; " +
                "��� ��������� �������: 'stop' ");

        do {
            str = br.readLine();
            pw.println("�� �����: " + str);
        } while (!str.equals("stop"));

        pw.println("������ ��������� ���������");
    }
}
