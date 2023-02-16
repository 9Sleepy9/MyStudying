package CollectionsDemo.Map;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // Создаём новое хеш-отображение для хранения баланса пользователей
        HashMap<String, Double> hm = new HashMap<>();

        // Добавляем элементы в хеш-отображение
        hm.put("John Dou", 3434.34); // Имена и фамилии вкладчиков отображаются на их баланс
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Toad Hall", 99.22);
        hm.put("Ralf Smith", -19.08);

        // Получаем множество (Set) записей из отображения для взаимодействия с ними
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Выводим все имеющиеся записи (ключ + значение)
        for (Map.Entry<String, Double> me : set)
            System.out.println(me.getKey() + ": " + me.getValue());

        System.out.println();

        // Увеличиваем баланс Джона Доу на 1000
        double balance = hm.get("John Dou");
        hm.put("John Dou", balance + 1000);
        System.out.println("Updated John Dou account balance: " + hm.get("John Dou"));
    }
}
