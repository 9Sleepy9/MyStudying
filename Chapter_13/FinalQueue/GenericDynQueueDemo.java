package Chapter_13.FinalQueue;

public class GenericDynQueueDemo {

    public static void main(String args[]) {

        Object c;

        Integer[] start = {1, 2, 3, 4, 5};

        GenDynQueue<Integer> gdq = new GenDynQueue<>(start);

        for (int i = 0; i < 50; i++) {
            System.out.println("���������� �������� '" + i + "' � �������");
            gdq.put(i);
        }

        System.out.println();

        try {
            for (int i = 0; i < 50; i++) {
                c = gdq.gett();
                int d = Integer.parseInt(c.toString());
                System.out.println("���������� �������� '" + d + "' �� �������");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
