package Chapter_14;


interface IntPredicate {
    boolean test(int n);
}


class MyIntNum {

    private int v;

    MyIntNum(int x) { v = x; }
    //int getNum() { return v;}

    boolean isFactor(int n) {
        if  ((v % n) == 0) {
            System.out.println(n + " is a divider of " + v);
            return true;
        }
        else {
            System.out.println(n + " is NOT a divider of " + v);
            return false;
        }
    }

}

public class MethodRefDemo2 {

    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum1 = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum1::isFactor;
        result = ip.test(3);

        ip = myNum2::isFactor;
        result = ip.test(3);
    }
}
