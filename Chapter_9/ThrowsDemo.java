package Chapter_9;

public class ThrowsDemo {

    static char prompt (String str)

        // Обычно мы используем throws, когда нужно обработать исключения, не входящие в стандартный пакет Java.lang
        throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]){

        char ch = 'X';

        try {
            ch = prompt("Введите букву");
        }
        catch (java.io.IOException exc) {
            System.out.println("Произошло исключение ввода-вывода!");
            ch = 'X';
        }
        finally {
            System.out.println("1 Вы ввели букву: " + ch);
        }
        System.out.println("2 Вы ввели букву: " + ch);
    }
}