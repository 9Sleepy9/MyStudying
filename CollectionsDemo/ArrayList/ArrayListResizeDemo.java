package CollectionsDemo.ArrayList;

import java.util.ArrayList;

public class ArrayListResizeDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        // Позволяет заранее выделить место в оперативной памяти под 6 объектов
        al.ensureCapacity(6);
        // При этом размер не меняется
        System.out.printf("Размер массива al: %d\n", al.size());
        al.add(1); al.add(2); al.add(3); al.add(4); al.add(5);
        System.out.println("Содержание массива al: " + al);

        // При одновременном добавлении множества объектов и выделении ОЗУ работает медленнее
        al.add(6);
        System.out.printf("Размер увеличенного массива al: %d\n", al.size());
        // Также можно изначально выделить ОЗУ через конструктор ArrayList
        ArrayList<Integer> al2 = new ArrayList<>(9);
        al2.add(10);
        System.out.println(al2);
        // Уменьшает размер занимаемой памяти до необходимого минимума, полезно применять перед копированием
        al2.trimToSize();
    }
}
