package CollectionsDemo.HashSet;

import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        // ������ ��������� ���-��������� �� ����������� ������������� (������� 16, ����������� ���������� 0.75)
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        // ��������� �������� � ���-���������
        hs.add("����");
        hs.add("�����");
        hs.add("���");
        hs.add("�����");
        hs.add("�������");
        hs.add("�����");

        // � ������ ��������� �������� ����� �������� � ��� �������, � ������� ��� ���� ���������
        System.out.println(hs);
    }
}
