package Chapter_13.FinalQueue;

public class GenericCircularQueueDemo {

    public static void main(String[] args) {

        Integer[] queueI = new Integer[10];
        int a;

        GenCircularQueue<Integer> qI = new GenCircularQueue<>(queueI);

        System.out.println("���������: ");
        for (int i = 0; i < 15; i++) {
            System.out.println("���������� �������� '" + i + "' � �������");
            qI.put(i);
        }

        System.out.println("\n��������� ��������: ");
        for (int i = 15; i < 35; i++) {
            System.out.println("���������� �������� '" + i + "' � �������");
            qI.put(i);
        }

        System.out.println("���������: ");
        try {
            for (int i = 0; i <= 15; i++) {
                a = qI.get();
                System.out.println("���������� �������� '" + a + "' �� �������");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
