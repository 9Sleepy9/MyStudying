package CollectionsDemo.Map;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Создаём новое древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>();

        // Добавляем элементы в отображение
        tm.put("John Dou", 3434.34); // Имена и фамилии вкладчиков отображаются на их баланс
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Toad Hall", 99.22);
        tm.put("Ralf Smith", -19.08);

        // Получаем множество (Set) записей из отображения для взаимодействия с ними
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Выводим всё множество записей
        for (Map.Entry<String, Double> me : set)
            System.out.println(me.getKey() + ": " + me.getValue());

        System.out.println();

        // Получаем текущее значение баланса Джона и увеличиваем на 1000
        double balance = tm.get("John Dou") + 1000;
        // Обновляем объект
        tm.put("John Dou", balance);
        // В данном случае элементы будут отсортированы по имени
        System.out.println("Updated John Dou account balance: " + tm.get("John Dou"));
    }
}
