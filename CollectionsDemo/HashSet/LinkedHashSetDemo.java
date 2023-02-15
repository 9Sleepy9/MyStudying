package CollectionsDemo.HashSet;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        // Создаём связанное хеш-множество со стандартным конструктором (емкость 16, коэффициент заполнения 0.75)
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        // Добавляем элементы в хэш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        // В данном множестве элементы будут выведены в том порядке, в котором они были добавлены
        System.out.println(hs);
    }
}
