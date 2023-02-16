package CollectionsDemo.Map;

import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        lhm.put("John Dou", 3434.34); // Имена и фамилии вкладчиков отображаются на их баланс
        lhm.put("Tom Smith", 123.22);
        lhm.put("Jane Baker", 1378.00);
        lhm.put("Toad Hall", 99.22);
        lhm.put("Ralf Smith", -19.08);

        Set<Map.Entry<String, Double>> set = lhm.entrySet();

        // Все элементы выводятся в том порядке, в котором они были добавлены
        for (Map.Entry<String, Double> me : set)
            System.out.println(me.getKey() + " : " + me.getValue());
    }
}
