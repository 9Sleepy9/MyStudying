// ��������� ���������, ������� ����� �� ����� ������ ��������

package MyOwnQuests;

import java.util.Arrays;

public class ArraySearch {

    private static int counter1 = 0;

    public static int ArraySearchSimple (double[] x, double key) {

        int counter = 0;
        for (double i : x) {
            if (i == key)
                counter++;
        }

        return counter;
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array); // ����� ������� �������������
        int c1, c2;
        /*
            ������ ������,
            �������� ����� ���������� ��� �� ������ ���������,
            ����� ������������ benchmarks
            ��. https://habr.com/ru/post/349914/
            �� ������� ����� �������
         */
        long time = System.currentTimeMillis(); // ������� �����, unix-time
        c1 = ArraySearchSimple(array, 0.5);
        System.out.println(System.currentTimeMillis() - time + " c: " + c1);

        time = System.currentTimeMillis();
        c2 = QuickSort.quicksort(array, 0.5);
        System.out.println(System.currentTimeMillis() - time + " c: " + c2);
    }

    static class QuickSort {

        //�����, ������� �� ����� ��������, ��������� ���� ������
        static int quicksort(double items[], double key){
            return qs(items, 0, items.length-1, key);
        }

        //��� ����� ������� ����������
        private static int qs(double items[], int left, int right, double key){

            int middle = (left + right) / 2;

            if (items[middle] == key)
                counter1++;

            if (right < left)
                return counter1++;

            else if ( key < items[middle]){
                System.out.println("��� ��������; right = " + right + "; left = " + left + "; counter = " + counter1);
                return qs(items, left, middle - 1, key);
            }

            else {
                System.out.println("��� ��������; right = " + right + "; left = " + left + "; counter = " + counter1);
                return qs(items, middle + 1, right - 1, key);
            }
        }
    }
}