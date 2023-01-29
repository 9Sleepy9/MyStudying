package Chapter_12;

public class ManualWrapAndAutoWrap {

    public static void main(String args[]) {

        // ������ �������� � ���������� �������� ����
        Integer iOb = new Integer(100);
        int a = iOb.intValue();
        System.out.println(a + " " + iOb);

        System.out.println();

        // �������������� �������� � ���������� �������� ����
        Integer iObj = 100;
        int b = iObj;
        System.out.println(b + " " + iObj);

        System.out.println();

        // ���������� ������������ � �������������� � �������

        m1(199); // ������������ �������� 199 ���� int � ������ Integer

        Integer iobj2 = m2(); // ������������ �������� 10 ���� int ����������� �� m2()

        int i = m3(); // �������������� �������� 99 ���������� � ������ ���� Integer � ��� int

        iobj2 = 100; // ������������ �������� 100 ���� int � ������ ���� Integer

        System.out.println("������ ���������� �� iobj2: " +
                            Math.sqrt(iobj2)); // �������������� � ������� ��� int � ��������� �� ���� double
                                                // ��� ���������� ������ sqrt()

        System.out.println();

        // ���������� ������������ � �������������� � ����������
        Integer iObj3, iObj4;
        int c;

        // ������������ ����� 99
        iObj3 = 99;
        System.out.println("�������� �������� iObj3: " + iObj3);

        // ��������������, ����������������� �������� ���� � ����������� ������������
        ++iObj3;
        System.out.println("����� ++iObj3: " + iObj3);

        // ��������������, ���������� ��������� ��� �������� ���� � ����������� ������������
        iObj3 += 10;
        System.out.println("����� iObj3 += 10: " + iObj3);

        // ��������������, ���������� ��������� ��� �������� ���� � ����������� ������������ � ������ iObj4
        iObj4 = iObj3 + (iObj3 / 3);
        System.out.println("iObj4 ����� ���������� ���������: " + iObj4);

        // ��������������, ���������� ��������� � ���������� ���������� � ���������� �������� ����
        c = iObj3 + (iObj3 / 3);
        System.out.println("'c' ����� ���������� ���������: " + c);

        System.out.println();

        // ���������� �������������� � ������ switch
        Integer iObj5 = 2;
        // ������ ������������� ��������������� � ������� ���, ��� ����� ���� ���������� ��������� switch
        switch (iObj5) {
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("���");
                break;
            case 3:
                System.out.println("���");
                break;
            default:
                System.out.println("������!");
        }
    }

    //������ ��� ������������
    static void m1 (Integer v) {
        System.out.println("m() ������� " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }
}
