package Chapter_14;


interface MyIntNumPredicate {
    boolean test(MyIntNums mv, int n);
}


class MyIntNums {
    private int v;

    MyIntNums (int n) { v = n; }

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

public class MethodRefDemo3 {

    public static void main(String[] args) {

        boolean result;

        MyIntNums myNum1 = new MyIntNums(12);
        MyIntNums myNum2 = new MyIntNums(16);

        MyIntNumPredicate inp = MyIntNums::isFactor;

        result = inp.test(myNum1, 3);
        result = inp.test(myNum2, 3);
    }
}
