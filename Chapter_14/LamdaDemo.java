package Chapter_14;

// Функциональные интерфейсы
interface MyValue {
    double GetValue();
}

interface GetMyValue {
    double GetValue(double n);
}

// Демонстрация работы Лямда-выражений
public class LamdaDemo {

    public static void main(String[] args) {

        // В два действия
        MyValue val;
        val = () -> 98.6;

        System.out.println("Значение val: " + val.GetValue());

        System.out.println();

        // В одно действие
        GetMyValue getval = (n) -> 1 / n;

        System.out.println("Обратное число к 4 - " + getval.GetValue(4) + "\n");
        System.out.println("Обратное число к 8 - " + getval.GetValue(8));

        /*
        Следущие строки не сработают:
        val = () -> "three"; // Ошибка с типом данных

        getval = () -> Math.random(); // Нет параметра
         */
    }
}
