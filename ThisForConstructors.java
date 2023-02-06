class MyClass {

    private final int a, b;

    MyClass(int a , int b) {
        this.a = a;
        this.b = b;
    }

    MyClass(int i) {
        this(i, i);
    }

    public void showab() {
        System.out.println("a: " + a +"\n"
                + "b: " + b);
    }
}

public class ThisForConstructors {

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, 2);
        obj1.showab();

        MyClass obj2 = new MyClass(2);
        obj2.showab();
    }
}
