package Chapter_14;

import java.util.function.Predicate;


interface MyTest<T extends Number> {
    boolean testing(T n);
}

interface MyFunc2<T> {
    T func(T param);
}



public class ChapterQuestions {

    public static void main(String[] args) {

        MyTest<Double> checkpr = (n) -> (n >= 10 && n <= 20);
        System.out.println(checkpr.testing(12.0));

        System.out.println();

        NumericFns fact = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println(fact.func(5));

        System.out.println();

        MyFunc2<Integer> mf2 = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println(mf2.func(10));
        
        System.out.println();
    }
}
