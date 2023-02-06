import java.io.FileInputStream;
import java.io.IOException;

public class VarDemo {
    public static void main(String[] args) throws IOException {

        var counter = 10; // выведение локальных переменных
        System.out.println("Значение выведенной переменной counter: " + counter);

        int var = 1; // допустимо
        System.out.println("Значение обычной переменной var: " + var);

        var k = -var;
        System.out.println("Значение выведенной переменной k: " + k);

        var myArray = new int[10]; // также допустимо, без скобочек

        System.out.println();

        var myStr = "Hello, Java!";

        // Более очевидны преимущества var при выведении ссылочных типов
        // Стандартный вариант:
        FileInputStream fin1 = new FileInputStream("Test.txt");
        fin1.close();
        // Вариант с var (также применимо к пользовательским классам)
        try (var fin2 = new FileInputStream("Test.txt")) {
        }

        System.out.println();

        class MyClass<T> {

        }
        // Также допустимо, сокращает запись
        var mc = new MyClass<Integer>();

        // Выведение типа переменной цикла
        System.out.print("Значения x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        // Здесь var нельзя
        int[] nums = {1, 2, 3, 4, 5};
        // А ниже это значительно упрощает запись, особенно при работе с объектами
        System.out.print("Значения в nums: ");
        for (var v : nums)
            System.out.print(v + " ");

        System.out.println();

        var version = Runtime.version();
        System.out.println("Счётчик функциональных выпусков: " + version.feature() +
                "\nСчётчик промежуточных версий: " + version.interim() +
                "\nСчётчик выпусков обновлений: " + version.update() +
                "\nСчётчик выпусков исправлений: " + version.patch() +
                "\nОбщий счётчик версии: " + version.version());
    }
}
