package Chapter_14;


interface NumericFns {
    int func(int i);
}
public class BlockLambdaDemo {

    public static void main(String[] args) {

        // Демонстрация создания блочного лямбда-выражения
        NumericFns smallestF = (n) -> {
            int result = 1;

            n = Math.abs(n);
            for (int i = 2; i <= n/i; i++)
                if ((n % i) == 0) {
                    result = i;
                    break;
                }

            return result;
        };

        System.out.println("Наименьший делитель 12 - это '" + smallestF.func(12) + "'\n");
        System.out.println("Наименьший делитель 155 - это '" + smallestF.func(155) + "'\n");
    }
}
