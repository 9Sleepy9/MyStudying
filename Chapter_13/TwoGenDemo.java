package Chapter_13;

class TwoGen<T, V> {

    T obj1;
    V obj2;

    TwoGen (T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showTypes() {
        System.out.println("T - это " + obj1.getClass().getName());
        System.out.println("V - это " + obj2.getClass().getName());
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }
}

public class TwoGenDemo {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj =
                new TwoGen<>(88, "Generics");

        tgObj.showTypes();

        int v = tgObj.getObj1();
        System.out.println("Значение v: " + v);

        String str = tgObj.getObj2();
        System.out.println("Значение str: " + str);

    }
}
