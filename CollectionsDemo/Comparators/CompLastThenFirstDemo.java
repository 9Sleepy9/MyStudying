package CollectionsDemo.Comparators;

import java.util.*;

class CompLastName implements Comparator<String> {

    // Сортируем по фамилии
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}


class CompFirstName implements Comparator<String> {

    // Сортируем по имени (по сути сравниваем ФИО полностью, начиная с имени)
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}


public class CompLastThenFirstDemo {

    public static void main(String[] args) {

        // Используем метод thenComparing() для создания нового компаратора на основе двух,
        // для сортировки сначала первым компаратором по фамилии и, если они равны,
        // то сортировки вторым компаратором по имени (условно, т.к. они объеденены в один)
        CompLastName cln = new CompLastName();
        Comparator<String> compLastThenFirst = cln.thenComparing(new CompFirstName());

        // То же самое, только в форме лямбда-выражения
        Comparator<String> compareLastName = (o1, o2) ->
                o1.substring(o1.lastIndexOf(' ')).compareToIgnoreCase(o2.substring(o2.lastIndexOf(' ')));

        Comparator<String> compareLastThenFirst = compareLastName.thenComparing(Comparator.naturalOrder());

        // Создаём новое древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(compareLastThenFirst);

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
