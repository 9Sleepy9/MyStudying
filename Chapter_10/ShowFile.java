package Chapter_10;

import java.io.*;

public class ShowFile {

    public static void main(String[] args) {

        int i; // Для вывода байтов из файла
        FileInputStream fis = null; // Здесь будет храниться целевой файл (наверное, ссылка)

        // Проверяем, получили ли мы ссылку на файл или хоть какой-то входной аргумент
        // (можно полную - можно сокращённую, программа ищет в папке проекта)
        if (args.length != 1) {
            System.out.println("Необходим входной файл");
            return; // Если ничего не получили, то выходим из метода main()
        }

        try {
            fis = new FileInputStream(args[0]); // Передаём ссылку на файл конструктору класса FileInputStream,
                                                // после чего ссылку на соответствующий объект в переменную fis

            do {
                i = fis.read(); // считываем один байт из файла
                if ( i != -1 ) // если не достигнут конец файла
                    System.out.print( (char) i ); // выводим символ, который в байтовом виде сейчас хранится в i
            } while (i != -1); // пока файл не закончился
        }
        // Обработка исключений
        catch (FileNotFoundException exc) { // Если неверно указана ссылка на файл
            System.out.println("Ошибка! Файл не найден");
        }
        catch (IOException exc) { // Если произошла ошибка при чтении
            System.out.println("Ошибка при чтении файла");
        }

        /*
            Также, можно сократить обработку исключений до:
                ...
                }
                catch (IOException exc) {
                    System.out.println("Ошибка ввода-вывода " + exc);
                }
                finally
                ...
         */

        finally { // Закрыть файл нужно в любом случае

            try {
                if (fis != null) fis.close(); // Если файл был открыт, то закрываем его
            }
            catch (IOException exc) { // Обрабатываем возможные ошибки при закрытии файла
                System.out.println("Ошибка при закрытии файла");
            }

        }
    }
}
