package CollectionsDemo.HashSet;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        // Создаём хеш-множество со стандартным конструктором (емкость 16, коэффициент заполнения 0.75)
        HashSet<String> hs = new HashSet<>();

        // Добавляем элементы в хэш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        // Элементы выводятся не в определённом порядке, т.к. они не сохраняются в сортированном виде
        // Для вывода в том порядке, в котором элементы были добавлены необходимо использовать LinkedHashSet
        System.out.println(hs);
    }
}