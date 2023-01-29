package Chapter_10;

import java.io.*;

public class RWDataDemo {

    public static void main(String[] args) {

        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Записываем несколько значений простых типов в файл testdata (и создаём его)
        try ( DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata.txt")) )
        {
            // Созданный файл будет нечитаемый, т.к. мы записываем простые типы данных, а НЕ символы!
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        System.out.println();

        // Считываем записанные значения и выводим их на консоль
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata.txt")))
        {
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);

            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
