package Chapter_10;

import java.io.*;
import java.util.Scanner;

public class AvgNums {

    public static void main(String[] args) throws IOException {

        int err = 0;
        int n = 0;
        int c = 0;
        double d;
        double avg = 0;
        double sum = 0;
        String str;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        try {
            do {
                if (err == 0)
                    System.out.println("������� ������ ��������� �� 1 �� 10: ");
                else
                    System.out.println("������, ������ ����� ���� � ��������� �� 1 �� 10");

                if (sc.hasNextInt()) n = sc.nextInt();
                err++;
            } while (n > 10 || n < 1);

        } catch (NumberFormatException exc) {
            System.out.println("�������� ������: " + exc);
        }

        err = 0;

        do {
            System.out.println("������� ���� � ����� ��� ������ �����: ");
            str = br.readLine();
            if (!str.contains(".txt"))
                str = str + ".txt";
            try (BufferedReader bfr = new BufferedReader(new FileReader(str))) {
                err++;
                do {
                    str = bfr.readLine();
                    if (str != null) {
                        c++;
                        try {
                            d = Double.parseDouble(str);
                            System.out.println(d);
                            sum += d;
                        } catch (NumberFormatException exc) {
                            System.out.println("�������� ������!");
                            c--;
                        }
                    }
                    else
                        break;

                } while (true);

                if (c != 0)
                    avg = sum / c;
                else
                    System.out.println("�� ���� ������� �����");

            } catch (FileNotFoundException exc) {
                System.out.println("������! �������� ���� � �����: " + exc);
            }
        } while (err == 0);

        err = 0;

        do {
            System.out.println("������� ���� � ����� ��� ������: ");
            str = br.readLine();
            if (!str.contains(".txt"))
                str = str + ".txt";
            try (FileWriter fw = new FileWriter(str, true)) {
                err++;
                if (avg != 0) {
                    str = Double.toString(avg);
                    fw.write("���� ������: " + n + "\r\n");
                    fw.write("������� ��������: " + str + "\r\n");
                }
            } catch (FileNotFoundException exc) {
                System.out.println("������! �������� ���� � �����: " + exc);
            } catch (IOException exc) {
                System.out.println("������ �����-������: " + exc);
            }
        } while (err == 0);

        System.out.println("���������� �������� ������� ���������, ��������� ������� � ����");
    }
}
