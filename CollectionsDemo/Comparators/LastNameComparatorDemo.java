package CollectionsDemo.Comparators;

import java.util.*;

class LastNameComparator implements Comparator<String> {

    int i, j, k;

    @Override
    public int compare(String o1, String o2) {
        // Находим индекс, с которого начинается фамилия
        i = o1.lastIndexOf(' '); // имя и фамилия разделены пробелом
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j)); // сравниваем подстроки из фамилий

        // Если фамилии одинаковы, то сравниваем обычным способом (по сути, по имени)
        if (k == 0)
            return o1.compareTo(o2);
        else
            return k;
    }
}

public class LastNameComparatorDemo {

    public static void main(String[] args) {

        // Создаём новое древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(new LastNameComparator());

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
        // В данном случае элементы будут отсортированы по фамилии
        System.out.println("Updated John Dou account balance: " + tm.get("John Dou"));
    }
}
