package CollectionsDemo.Map;

import java.util.*;

enum Weather {
    COLD, HOT, NORMAL
}

public class EnumMapDemo {

    public static void main(String[] args) {

        EnumMap<Weather, Double> em = new EnumMap<>(Weather.class);

        em.put(Weather.COLD, -15.0);
        em.put(Weather.HOT, 20.0);
        em.put(Weather.NORMAL, 10.0);

        Set<Map.Entry<Weather, Double>> set = em.entrySet();

        for (Map.Entry<Weather, Double> me : set)
            System.out.println(me.getKey() + " : " + me.getValue());
    }
}
