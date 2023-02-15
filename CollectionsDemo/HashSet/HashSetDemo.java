package CollectionsDemo.HashSet;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        // ������ ���-��������� �� ����������� ������������� (������� 16, ����������� ���������� 0.75)
        HashSet<String> hs = new HashSet<>();

        // ��������� �������� � ���-���������
        hs.add("����");
        hs.add("�����");
        hs.add("���");
        hs.add("�����");
        hs.add("�������");
        hs.add("�����");

        // �������� ��������� �� � ����������� �������, �.�. ��� �� ����������� � ������������� ����
        // ��� ������ � ��� �������, � ������� �������� ���� ��������� ���������� ������������ LinkedHashSet
        System.out.println(hs);
    }
}