package Chapter_10;

import java.io.FileInputStream;
import java.io.IOException;

public class Compare2Files {

    public static void main(String[] args) {

        int i;
        int j;
        int num = 0;

        if (args.length != 2){
            System.out.println("Ошибка! Для работы необходимо ввести путь к двум файлам");
            return;
        }

        try (FileInputStream fis1 = new FileInputStream(args[0]);
            FileInputStream fis2 = new FileInputStream(args[1]))
        {
            do {
                i = fis1.read();
                j = fis2.read();
                if ( i != j && i + 32 != j && i - 32 != j ) break;
                num++;
            } while (i != -1);
            if (i != j)
                System.out.println( "Файлы не одинаковы " +
                        "\nОтличаются символы в позиции: " + num +
                        " (если считать с 0)" +
                        "\nЭто символы: " + (char) i + " и " + (char) j );
            else
                System.out.println("Файлы одинаковы");
        }
        catch (IOException exc) {
            System.out.println("Ошибка при сравнении файлов: " + exc);
        }
    }
}