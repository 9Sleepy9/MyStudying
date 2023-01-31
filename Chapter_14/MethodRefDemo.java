package Chapter_14;


interface IntPredicates {

    boolean test(int n);
}



class MyIntPredicates {

    static boolean isEven(int n) {
        return  (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return (n > 0);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n/i; i++) {
            if ((n % i) == 0)
                return false;
        }

        return true;
    }
}

public class MethodRefDemo {

    static boolean numTest (IntPredicates p, int n) {
        return p.test(n);
    }

    public static void main(String[] args) {

        boolean result;

        result = numTest(MyIntPredicates::isPrime, 17);
        System.out.println("Number is Prime: " + result);

        result = numTest(MyIntPredicates::isEven, 17);
        System.out.println("Number is Even: " + result);

        result = numTest(MyIntPredicates::isPositive, 17);
        System.out.println("Number is Positive: " + result);
    }
}