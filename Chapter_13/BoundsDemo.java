package Chapter_13;

// Ограничение возможных типов-аргументов до класса Number и его подклассов
class NumericFns <T extends Number> {

    T num;

    NumericFns (T num) {
        this.num = num;
    }

    // Обратное значение для заданного числа
    double reciprocal() {
        return ( 1 / num.doubleValue() );
    }

    // Дробная часть заданного числа
    double fraction() {
        return ( num.doubleValue() - num.intValue() );
    }
}


// Гарантируем совместимость классов T и V
class Pair<T, V extends T> {

    T first;
    V second;

    Pair (T a, V b) {
        first = a;
        second = b;
    }
}

public class BoundsDemo {

    public static void main(String[] args) {

        NumericFns<Number> numN = new NumericFns<>(10);
        System.out.println("Обратная величина numN: " + numN.reciprocal());
        System.out.println("Дробная часть numN: " + numN.fraction());

        System.out.println();

        NumericFns<Double> numD = new NumericFns<>(12.29);
        System.out.println("Обратная величина numD: " + numD.reciprocal());
        System.out.println("Дробная часть numD: " + numD.fraction());

        // Не компилируется
        // NumericFns<String> ...

        System.out.println();

        Pair<Number, Double> p1 = new Pair<>(10, 13.3);
        Pair<Integer, Integer> p2 = new Pair<>(5, 7);
        // Не компилируется, т.к. Byte не наследует Double, чтобы работало тип 'T' должен быть 'Number'
        // Pair<Double, Byte> p3 ...
    }
}
