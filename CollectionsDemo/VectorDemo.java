package CollectionsDemo;

import java.util.*;
/**
�������� ������� �� ������ ArrayList ����������� � ���,
��� Vector ��������������� � ����� �� ���� �������,
����������� ������ �� Collections Framework
 */

public class VectorDemo {

    public static void main(String[] args) {

        // ��������� ������� ������� - 3, ��������� - 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("��������� ������ �������: " + v.size());
        System.out.println("��������� ������� �������: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("������� ������� ����� ����� 4-� ���������: " + v.capacity());

        System.out.println("������ �������: " + v.firstElement());
        System.out.println("��������� �������: " + v.lastElement());

        if (v.contains(3))
            System.out.println("v �������� 3");

        // ���������� ������ ��������� - ��������� Enumeration
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\n�������� �������:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
    }
}
