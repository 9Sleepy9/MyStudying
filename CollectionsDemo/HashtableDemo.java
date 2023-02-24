package CollectionsDemo;

import java.util.*;

/**
 * ������ ����� ����� ��������� ��������� Map � ������������ � ���������.
 * �� ������� ������ HashMap, �� ���� ����� ������ ���� "���� - ��������"
 * � ���-�������, �� ���� �������:
 * - Hashtable ���������������;
 * - �� �����, �� �������� �� ����� ���� �������;
 * -
 */

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John Dou", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Toad Hall", 99.22);
        balance.put("Ralf Smith", -19.08);

        // ������� �����������, ������ ����� �� ������������ ��������� ��������,
        // ������� ��� ������ ����������� balance ������������ ������������ names
        names = balance.keys();
        while(names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + " : " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("John Dou");
        balance.put("John Dou", bal + 1000);
        System.out.println("Updated John Dou account balance: " + balance.get("John Dou"));

        System.out.println("\n�������������� �����:\n");

        Set<String> set = balance.keySet();
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + " : " + balance.get(str));
        }

        System.out.println();

        for (String s : set) {
            System.out.println(s + " : " + balance.get(s));
        }
    }
}
