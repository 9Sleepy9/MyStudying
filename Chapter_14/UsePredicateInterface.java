package Chapter_14;
// We need to import interface first
import java.util.function.*;


// In this class I demonstrate use of some 'interfaces' from package 'function'
public class UsePredicateInterface {

    int n = 5;

    static String testStr () {
        return "It is Strange...";
    }

    Integer testInt () {
        n += n;
        return n;
    }

    public static void main(String[] args) {

        Predicate<Integer> isEven = (n) -> (n % 2) == 0;

        if (isEven.test(4))
            System.out.println("4 - is an Even number");
        if (!isEven.test(5))
            System.out.println("5 - is NOT an Even number");

        System.out.println();

        Supplier<String> getstr = UsePredicateInterface::testStr;
        System.out.println(getstr.get());

        System.out.println();

        UsePredicateInterface upi = new UsePredicateInterface();
        Supplier<Integer> sup = upi::testInt;
        System.out.println(sup.get());
    }

}
