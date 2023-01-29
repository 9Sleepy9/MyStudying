package Chapter_13.FinalQueue;

public class GenericQueueDemo {

    public static void main(String[] args) {

        Integer[] iStore = new Integer[10];

        GenQueue<Integer> iq = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("������������ ������� ����� ���� Integer");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("���������� '" + i + "' � ������� q");
                iq.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("��������� ���������� ����� ���� Integer �� ������� q: ");
                iVal = iq.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // ������� ��� ����� � ��������� ������
        Double[] dStore = new Double[10];
        GenQueue<Double> dq = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("������������ ������� ����� ���� Double: ");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("���������� '" + (double) i/2 + "' � ������� dq");
                dq.put((double) i/2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("��������� ���������� ����� ���� Double �� ������� dq: ");
                dVal = dq.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
