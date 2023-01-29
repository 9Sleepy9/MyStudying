package Chapter_12;

// ����������� ����������� ������ �� ������ Math ��� ���������� ����
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// ��� ����� ������� ���, �� �� ����� �������������� ����������� ��������:
// import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String args[]) {

        double a, b, c, x, D;

        a = 4;
        b = 1;
        c = -2;

        // ������� ������ �������������
        D = sqrt(pow(b, 2) - 4 * a * c);

        // ������� ������ ������
        x = (-b + D) / (2 * a);
        System.out.println("������ ������: " + x);

        // ������� ������ ������
        x = (-b - D) / (2 * a);
        System.out.println("������ ������: " + x);
    }
}
