package Chapter_13;

interface Containment<T extends Number> {

    boolean contains(T o);
}


class MyClass <T extends Number> implements Containment<T> {

    T[] objArray;

    MyClass (T[] o) {
        objArray = o;
    }

    @Override
    public boolean contains(T o) {
        for (T x : objArray) {
            if (o.equals(x))
                return true;
        }

        return false;
    }
}

public class GenericInterfaceDemo {

    public static void main(String[] args) {

        Integer[] iObjArr = {1, 2, 3, 4, 5};
        MyClass<Integer> testArr = new MyClass<>(iObjArr);

        if (testArr.contains(1))
            System.out.println("testArr contains 1");
        else
            System.out.println("testArr do NOT contains 1");

        if (testArr.contains(6))
            System.out.println("testArr contains 6");
        else
            System.out.println("testArr do NOT contains 6");

        // Недопустимо, т.к. тип объекта - Integer
        // if (testArr.contains(9.99))
    }
}
