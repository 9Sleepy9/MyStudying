package Chapter_6;

public class JustTesting {
    public static void main (String args[]){

        int d = 10;
        int c = 0;
        double s = 10;
        double x = 15000;

        do {
            s*= 1.03;
            if ( ( (int) s != d) & ((int) s % 5 == 0)) {System.out.println("+ 10 ��� � ������ �����: " + (c+1)); s = (int) s + 5; d = (int) s;}
            x -= s;
            //if (s > 100000) {System.out.println("�����"); break;}
            c++;
        } while (x>0);

        System.out.println("������� ����� ����. �����: " + s*36);
        System.out.println("���������� ����������: " + c);

    }
}