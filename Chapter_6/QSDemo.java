package Chapter_6;

class QuickSort {

    //�����, ������� �� ����� ��������, ��������� ���� ������
    static void quicksort(char items[]){
        qs(items, 0, items.length-1);
    }

    //��� ����� ������� ����������
    private static void qs(char items[], int left, int right){

        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right)/2];
        System.out.println("x = " + x);

        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;

                //����� �������������� �������
                System.out.print("������������� ������: ");
                for (char z : items) System.out.print(z + " ");
                System.out.println();
            }

        } while (i <= j);

        System.out.println("��� ��������; j = " + j + "; i = " + i + "; right = " + right + "; left = " + left);
        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }

}

class QSDemo {

    public static void main (String args[]){
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("�������� ������: ");
        for (char x : a) System.out.print(x + " ");

        System.out.println();

        //���������� �������
        QuickSort.quicksort(a);

        System.out.print("��������������� ������: ");
        for (char x : a) System.out.print(x + " ");
    }

}
