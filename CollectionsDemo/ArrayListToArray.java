package CollectionsDemo;

import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> ali = new ArrayList<>();

        ali.add(1); // ����� ����������� ������������ ����������� �����
        ali.add(2);
        ali.add(3);
        ali.add(4);

        System.out.println("���������� ���������� ������� ali: " + ali);

        // �������� �������� �� ���������� ������� ali � ������� ������ Integer
        Integer[] ia = new Integer[ali.size()];
        ia = ali.toArray(ia); // ���������� �������� ������� ������

        // ����� ����� ���������
        int sum = 0;
        for(int i : ia)
            sum += i;
        System.out.println("����� ���������: " + sum);
    }
}
