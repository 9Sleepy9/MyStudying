package Chapter_14;


interface MyClassArrayCreator {
    MyClass[] func (int n);
}

interface MyArrayCreator<T> {
    T[] func(int n);
}

class MyClass {
    private int num;

    MyClass(int n) { num = n; }

    int getNum() { return num; }

}

public class ArrayCreatorDemo {

    public static void main(String[] args) {

        MyClassArrayCreator cac = MyClass[]::new;
        MyClass[] a = cac.func(3);
        for (int i = 0; i < 3; i++) {
            a[i] = new MyClass(i);
            System.out.println(a[i].getNum());
        }

        System.out.println();

        MyArrayCreator<Thread> mact = Thread[]::new;
        Thread[] thrds = mact.func(5);
        for (int i = 0; i < thrds.length; i++) {
            thrds[i] = new Thread("It is Thread #" + i);
            System.out.println(thrds[i]);
        }
    }
}
