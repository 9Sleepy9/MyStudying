package Chapter_13;

class Summation {

    private int sum;

    // Здесь обобщённый только конструктор, так как этого достаточно
    <T extends Number> Summation (T obj) {
        sum = 0;

        for (int i = 0; i < obj.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}

public class GenericConstructorDemo {

    public static void main(String args[]) {
        Summation sum = new Summation(77.7);
        System.out.println("Sum: " + sum.getSum());
    }
}
