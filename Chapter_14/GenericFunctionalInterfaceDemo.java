package Chapter_14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Here we created Generic Functional Interface to test it with lambda
interface SomeTest<T> {

    boolean test(T n, T m);
}
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) throws IOException {

        int divisibleInt, dividerInt;
        // Creating BufferedReader object to read numbers from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str; // Object to contain String read from console

        // Testing some lambda functions with different types
        SomeTest<Integer> isIntFactor = (n, m) -> (n % m) == 0;

        System.out.println("Checking isIntFactor lambda: ");
        do {
            try {
                System.out.println("Give me divisible int number: ");
                str = br.readLine();
                divisibleInt = Integer.parseInt(str);
                System.out.println("Give me divider int number: ");
                str = br.readLine();
                dividerInt = Integer.parseInt(str);

                if (isIntFactor.test(divisibleInt, dividerInt))
                    System.out.println("Number " + dividerInt + " is factor for " + divisibleInt);
                else
                    System.out.println("Number " + dividerInt + " is NOT factor for " + divisibleInt);

                break;
            } catch (NumberFormatException exc) {
                System.out.println("\nPlease give me correct number...\n");
            }
        } while (true);

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

        String strTest = "Generic Functional Interface";

        System.out.println("Testing String: '" + strTest + "'");
        if (isIn.test(strTest, "face"))
            System.out.println("String contains 'face'");
        else
            System.out.println("String does not contains 'face'");
    }
}
