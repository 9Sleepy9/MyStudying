package Chapter_14;

interface NumericTest {
    boolean test(int i1, int i2);
}
public class LambdaDemo2 {

    public static void main(String[] args) {

        NumericTest test1 = (i1, i2) -> (i1 > i2) ? true : false;
        System.out.println("test1\nИстина: " + test1.test(12, 10)
                            + "\nЛожь: " + test1.test(10, 12) + "\n");

        NumericTest test2 = (i1, i2) -> (i1 < i2);
        System.out.println("test2\nИстина: " + test2.test(11, 12) + "\n");

        NumericTest test3 = (i1, i2) -> (Math.abs(i1) == Math.abs(i2));
        System.out.println("test3\n" + "Проверка равенства -10 и 10 по модулю: " + test3.test(-10, 10));

        NumericTest isFactor = (i1, i2) -> (i1 % i2) == 0;

        if (isFactor.test(10, 2))
            System.out.println("10 делится на 2 без остатка");
        if (!isFactor.test(10, 3))
            System.out.println("10 не делится на 3 без остатка");
    }
}
