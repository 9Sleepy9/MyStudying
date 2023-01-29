package Chapter_12;

// Импортируем статические методы из класса Math для сокращения кода
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// Ещё можно сделать так, но не стоит злоупотреблять статическим импортом:
// import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String args[]) {

        double a, b, c, x, D;

        a = 4;
        b = 1;
        c = -2;

        // Находим корень дискриминанта
        D = sqrt(pow(b, 2) - 4 * a * c);

        // Находим первый корень
        x = (-b + D) / (2 * a);
        System.out.println("Первый корень: " + x);

        // Находим второй корень
        x = (-b - D) / (2 * a);
        System.out.println("Второй корень: " + x);
    }
}
