package Chapter_6;

class QuickSort {

    //Метод, который мы будем вызывать, передавая лишь массив
    static void quicksort(char items[]){
        qs(items, 0, items.length-1);
    }

    //Сам метод быстрой сортировки
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

                //Вывод промежуточного массива
                System.out.print("Промежуточный массив: ");
                for (char z : items) System.out.print(z + " ");
                System.out.println();
            }

        } while (i <= j);

        System.out.println("Идёт рекурсия; j = " + j + "; i = " + i + "; right = " + right + "; left = " + left);
        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }

}

class QSDemo {

    public static void main (String args[]){
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Исходный массив: ");
        for (char x : a) System.out.print(x + " ");

        System.out.println();

        //Сортировка массива
        QuickSort.quicksort(a);

        System.out.print("Отсортированный массив: ");
        for (char x : a) System.out.print(x + " ");
    }

}
