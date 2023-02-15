package CollectionsDemo.LinkedList;

import java.util.*;

class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address (String n, String str, String c, String sta, String code) {
        name = n;
        street = str;
        city = c;
        state = sta;
        this.code = code;
    }

    public String toString() {
        return "Address:\n" + name + "\n" + street + "\n" + city + "\n" + state + "\n" + code + "\n";
    }

}
public class MailList {

    public static void main(String[] args) {

        LinkedList<Address> ll = new LinkedList<>();

        ll.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ll.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ll.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Address ad : ll)
            System.out.println(ad);

        System.out.println();
    }
}
