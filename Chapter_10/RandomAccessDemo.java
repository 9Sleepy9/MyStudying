package Chapter_10;

import java.io.*;

public class RandomAccessDemo {

    public static void main(String[] args) {

        // Каждый элемент типа double занимает 8 байт
        double data[] = {19.4, 10.1, 123.54, 33, 87.9, 74.25};
        double d;

        // Создаём новый файл с модификатором доступа rw: read + write
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {

            // Записываем массив в файл
            for (int i = 0; i < data.length; i++)
                raf.writeDouble(data[i]);

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8);
            d  = raf.readDouble();
            System.out.println("Второе значение: " + d);

            // Находим позицию, исходя из того, что каждое значение данного типа занимает 8 байт, начиная с 0,
            // т.е. каждый новый элемент с 8-го, 16-го, 24-го и т.д. байта
            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Четвёртое значение: " + d);

            System.out.println();

            System.out.println("Чтение значений с нечётными порядковыми номерами: ");
            for(int i = 0; i < data.length; i+=2) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
