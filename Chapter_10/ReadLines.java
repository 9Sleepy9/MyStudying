package Chapter_10;

import java.io.*;

// Данные методики, в основном, используются в крупных проектах для их интернационализации
// Для отладки программ вполне подойдут стандартные System.in и System.out
public class ReadLines {

    public static void main(String[] args) throws IOException {

        String str;

        // Для ввода с консоли символов
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        // Для вывода на консоль символов; второй параметр autoFlush
        // полностью очищает буфер при каждом вызове методов вывода
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Программа считывает строки; " +
                "Для остановки введите: 'stop' ");

        do {
            str = br.readLine();
            pw.println("Вы ввели: " + str);
        } while (!str.equals("stop"));

        pw.println("Работа программы завершена");
    }
}
