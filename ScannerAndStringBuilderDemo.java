import java.io.IOException;
import java.util.Scanner;

public class ScannerAndStringBuilderDemo {

    public static void main(String[] args) {

        // Самый простой способ считывания с консоли
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.println("Введите строку: ");
        str = scan.nextLine();

        System.out.println("Вы ввели: " + str);

        // Недопустимо, т.к. мы считываем не строку, а число/массив типа int
        // str = System.in.read();
        // str = System.in.readAllBytes();

        System.out.println();

        // Демонстрация использования StringBuilder
        // Полезно использовать при необходимости часто применять конкатенацию строк,
        // т.к. сохраняет память и не замедляет работу программы
        // Все вариации являются допустимыми
        StringBuilder sb = new StringBuilder("First,");
        System.out.println(sb);
        sb.append(" Second");
        sb.append(',');
        sb.append(" Third").append('.');
        System.out.println(sb);

        // Демонстрация работы printf
        // %s - строка, %f - float, %d - простое число (digit),
        System.out.printf("Hello, %s\nDo you have %d apples?\nI received %f", "Java", 5, 11.11);
        System.out.println("\nLook at spaces:");
        System.out.printf("%10d\n%10d\n%-10d", 100, 999999, 100);
        System.out.println("\nLook at format: ");
        System.out.printf("%.2f\n%.3f\n%.4f\n", 44.4444, 44.4444, 44.4444);
    }
}
