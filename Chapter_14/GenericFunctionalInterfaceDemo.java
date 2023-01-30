package Chapter_14;


import java.io.IOException;

// Here we created Generic Functional Interface to test it with lambda
interface SomeTest<T> {

    boolean test(T n, T m);
}
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) throws IOException {

        // Testing some lambda functions with different types
        SomeTest<Integer> isIntFactor = (n, m) -> (n % m) == 0;

        System.out.println("Checking isIntFactor lambda: ");
        int divisibleInt = 100;
        int dividerInt = 10;

        if (isIntFactor.test(divisibleInt, dividerInt))
            System.out.println("Number " + dividerInt + " is factor for " + divisibleInt);
        else
            System.out.println("Number " + dividerInt + " is NOT factor for " + divisibleInt);

        System.out.println();

        SomeTest<Double> isDFactor = (n, m) -> (n % m) == 0;
        System.out.println("Checking isDFactor lambda: ");
        double divisibleD = 100;
        double dividerD = 10;

        if (isDFactor.test(divisibleD, dividerD))
            System.out.println("Number " + dividerD + " is factor for " + divisibleD);
        else
            System.out.println("Number " + dividerD + " is NOT factor for " + divisibleD);

        System.out.println();

        SomeTest<String> isIn = (n, m) -> n.contains(m);

        String str = "Generic Functional Interface";

        System.out.println("Testing String: '" + str + "'");
        if (isIn.test(str, "face"))
            System.out.println("String contains 'face'");
        else
            System.out.println("String does not contains 'face'");
    }
}
