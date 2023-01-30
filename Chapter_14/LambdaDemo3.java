package Chapter_14;

// Демонстрация возможности работы с объектами с помощью лямбда-выражений
interface StringDemo {
    boolean testString(String s1, String s2);
}

public class LambdaDemo3 {

    public static void main(String[] args) {

        StringDemo isIn = (s1, s2) -> s1.contains(s2);
        if (isIn.testString("ракета", "рак"))
            System.out.println("Строка 'ракета' содержит строку 'рак'\n");
        else
            System.out.println("Строка 'ракета' НЕ содержит строку 'рак'\n");

        if (isIn.testString("Ракета", "рак"))
            System.out.println("Строка 'Ракета' содержит строку 'рак'\n");
        else
            System.out.println("Строка 'Ракета' НЕ содержит строку 'рак'\n");
    }
}
