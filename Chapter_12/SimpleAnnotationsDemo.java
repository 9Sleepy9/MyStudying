package Chapter_12;

// ������� ����� MyClass, ��� ���������� � �� ��������������� � ���������� (Deprecated)
@Deprecated
class MyClass {
    private String msg;

    MyClass (String m) {
        msg = m;
    }

    // ������� ����� getMsg, ��� ���������� (Deprecated)
    @Deprecated
    String getMsg() {
        return msg;
    }
}

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class SimpleAnnotationsDemo {
    public static void main(String args[]) {

        MyClass MyObj = new MyClass("����");

        System.out.println(MyObj.getMsg());

        for (Tools t : Tools.values())
            System.out.println(t);
    }
}
