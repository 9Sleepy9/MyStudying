package Chapter_9;

public class ThrowsDemo {

    static char prompt (String str)

        // ������ �� ���������� throws, ����� ����� ���������� ����������, �� �������� � ����������� ����� Java.lang
        throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]){

        char ch = 'X';

        try {
            ch = prompt("������� �����");
        }
        catch (java.io.IOException exc) {
            System.out.println("��������� ���������� �����-������!");
            ch = 'X';
        }
        finally {
            System.out.println("1 �� ����� �����: " + ch);
        }
        System.out.println("2 �� ����� �����: " + ch);
    }
}