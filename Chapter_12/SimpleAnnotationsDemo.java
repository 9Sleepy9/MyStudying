package Chapter_12;

// Пометим класс MyClass, как Устаревший и не рекомендованный к применению (Deprecated)
@Deprecated
class MyClass {
    private String msg;

    MyClass (String m) {
        msg = m;
    }

    // Пометим метод getMsg, как Устаревший (Deprecated)
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

        MyClass MyObj = new MyClass("тест");

        System.out.println(MyObj.getMsg());

        for (Tools t : Tools.values())
            System.out.println(t);
    }
}
