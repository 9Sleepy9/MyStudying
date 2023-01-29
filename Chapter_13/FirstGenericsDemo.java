package Chapter_13;

class Gen <T> {

    T obj;

    Gen (T ob) {
        obj = ob;
    }

    T getobj() {
        return obj;
    }

    void showType() {
        System.out.println("��� 'T' � ������ ������ - ��� " + obj.getClass().getName());
    }
}

public class FirstGenericsDemo {
    public static void main(String[] args) {

        // �������� ������� ���� Integer �� ������ ����������� ������
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();

        // ����� ���������� ��������������
        int v = iOb.getobj();
        System.out.println("�������� v: " + v);

        System.out.println();

        // ����� ������ ����� ������� � ����� ��������
        Gen<String> strOb = new Gen<>("������������ ��������� (Generics)");

        strOb.showType();

        String str = strOb.getobj();
        System.out.println("�������� str: " + str);
    }
}
