package Chapter_12;

public class ManualWrapAndAutoWrap {

    public static void main(String args[]) {

        // Ручная упаковка и распаковка простого типа
        Integer iOb = new Integer(100);
        int a = iOb.intValue();
        System.out.println(a + " " + iOb);

        System.out.println();

        // Автоматическая упаковка и распаковка простого типа
        Integer iObj = 100;
        int b = iObj;
        System.out.println(b + " " + iObj);

        System.out.println();

        // Применение автоупаковки и автораспаковки в методах

        m1(199); // автоупаковка значения 199 типа int в объект Integer

        Integer iobj2 = m2(); // автоупаковка значения 10 типа int полученного из m2()

        int i = m3(); // автораспаковка значения 99 обернутого в объект типа Integer в тип int

        iobj2 = 100; // автоупаковка значение 100 типа int в объект типа Integer

        System.out.println("Корень квадратный из iobj2: " +
                            Math.sqrt(iobj2)); // автораспаковка в простой тип int и повышение до типа double
                                                // для выполнения метода sqrt()

        System.out.println();

        // Применение автоупаковки и автораспаковки в выражениях
        Integer iObj3, iObj4;
        int c;

        // Автоупаковка числа 99
        iObj3 = 99;
        System.out.println("Исходное значение iObj3: " + iObj3);

        // Автораспаковка, инкрементирование простого типа и последующая автоупаковка
        ++iObj3;
        System.out.println("После ++iObj3: " + iObj3);

        // Автораспаковка, вычисление выражения для простого типа и последующая автоупаковка
        iObj3 += 10;
        System.out.println("После iObj3 += 10: " + iObj3);

        // Автораспаковка, вычисление выражения для простого типа и последующая автоупаковка в объект iObj4
        iObj4 = iObj3 + (iObj3 / 3);
        System.out.println("iObj4 после вычисления выражения: " + iObj4);

        // Автораспаковка, вычисление выражения и сохранение результата в переменную простого типа
        c = iObj3 + (iObj3 / 3);
        System.out.println("'c' после вычисления выражения: " + c);

        System.out.println();

        // Применения автораспаковки в методе switch
        Integer iObj5 = 2;
        // Объект автоматически распаковывается в простой тип, уже после чего происходит обработка switch
        switch (iObj5) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }

    //Методы для демонстрации
    static void m1 (Integer v) {
        System.out.println("m() получил " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }
}
