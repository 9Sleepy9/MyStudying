package Chapter_10;

import java.io.*;
import java.util.Scanner;

public class AvgNums {

    public static void main(String[] args) throws IOException {

        int err = 0;
        int n = 0;
        int c = 0;
        double d;
        double avg = 0;
        double sum = 0;
        String str;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        try {
            do {
                if (err == 0)
                    System.out.println("Оцените работы программы от 1 до 10: ");
                else
                    System.out.println("Ошибка, оценка может быть в диапазоне от 1 до 10");

                if (sc.hasNextInt()) n = sc.nextInt();
                err++;
            } while (n > 10 || n < 1);

        } catch (NumberFormatException exc) {
            System.out.println("Неверный формат: " + exc);
        }

        err = 0;

        do {
            System.out.println("Введите путь к файлу для чтения чисел: ");
            str = br.readLine();
            if (!str.contains(".txt"))
                str = str + ".txt";
            try (BufferedReader bfr = new BufferedReader(new FileReader(str))) {
                err++;
                do {
                    str = bfr.readLine();
                    if (str != null) {
                        c++;
                        try {
                            d = Double.parseDouble(str);
                            System.out.println(d);
                            sum += d;
                        } catch (NumberFormatException exc) {
                            System.out.println("Неверный формат!");
                            c--;
                        }
                    }
                    else
                        break;

                } while (true);

                if (c != 0)
                    avg = sum / c;
                else
                    System.out.println("Не было найдено чисел");

            } catch (FileNotFoundException exc) {
                System.out.println("Ошибка! Неверный путь к файлу: " + exc);
            }
        } while (err == 0);

        err = 0;

        do {
            System.out.println("Введите путь к файлу для записи: ");
            str = br.readLine();
            if (!str.contains(".txt"))
                str = str + ".txt";
            try (FileWriter fw = new FileWriter(str, true)) {
                err++;
                if (avg != 0) {
                    str = Double.toString(avg);
                    fw.write("Ваша оценка: " + n + "\r\n");
                    fw.write("Среднее значение: " + str + "\r\n");
                }
            } catch (FileNotFoundException exc) {
                System.out.println("Ошибка! Неверный путь к файлу: " + exc);
            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        } while (err == 0);

        System.out.println("Вычисление среднего успешно завершено, результат сохранён в файл");
    }
}
