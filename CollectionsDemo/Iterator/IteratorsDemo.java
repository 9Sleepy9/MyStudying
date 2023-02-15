package CollectionsDemo.Iterator;

import java.util.*;

public class IteratorsDemo {

    public static void main(String[] args) {

        String element;

        // ������ ������� ��������� ������ al
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // ������ ������� �������� � ������� ��� ������� �� ���������� �������
        System.out.print("�������� ���������� ���������� ������� al: ");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        // ������ ListIterator, ������� ��������� �������� �������� � ������������ ���������
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("���������� ���������� ���������� ������� al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("���������� ����������� ���������� ������� al � �������� ������: ");
        litr = al.listIterator(al.size()); // ������������� ListIterator � ����� ������ � ������� ��������
        while (litr.hasPrevious()) {
            element = litr.previous();
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
