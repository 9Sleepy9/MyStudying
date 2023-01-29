package MyOwnQuests;

public class ArrayWithWeigth {

    private final int[] values; // ��������
    private final int[] weights; // ����
    private final int[] ranges; // ������� �����
    private int sum; // ����� ��� ���� �������� �� �������

    public ArrayWithWeigth(int[] values1, int[] weights1) {
        values = values1;
        weights = weights1;
        ranges = new int[values.length];

        // ����� ����� ���� �������� �� �������
        sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        // ��������� ranges ��������� �����
        int lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    /*
        ������ ranges ��� ��������, ��� ��� �������
        ������������� �������� � ���������� [0;sum],
        � ����� ��������, ��������������� �������� ����������� ����:
     */
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int ourRangeIndex = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > random) {
                break;
            }
            ourRangeIndex = i;
        }

        return values[ourRangeIndex];
    }

    /*�������� �����, ��� ������� ������ ������� �� ��� ��������
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int index = Arrays.binarySearch(ranges, random);
        return values[index >= 0 ? index : -index - 2];
    }
     */

}
