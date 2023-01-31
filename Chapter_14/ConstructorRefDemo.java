package Chapter_14;


interface MyNewFunc {
    MyNewClass func(String s);
}

interface MyNewFunc2 {
    MyNewClass func();
}


class MyNewClass {
    private String str;

    MyNewClass (String s) { str = s; }

    MyNewClass() { str = ""; }

    String getStr() { return str; }
}
public class ConstructorRefDemo {

    public static void main(String[] args) {

        MyNewFunc myClassCons = MyNewClass::new;
        MyNewClass mc = myClassCons.func("Testing...");
        System.out.println("String str in mc: " + mc.getStr());

        // Without parameters (default constructor)
        MyNewFunc2 mnf2 = MyNewClass::new;
        MyNewClass mc2 = mnf2.func();
        System.out.println("Nothing in mc2: " + mc2.getStr());
    }
}
