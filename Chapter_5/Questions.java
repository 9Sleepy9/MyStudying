package Chapter_5;

public class Questions {
    double b[];
    double [] x;

    double c[] = {1, 2, 3, 4, 5};

    public static void main (String args[]){
        double srednee [] = {5, 1, 2, 3, 5, 9, 9, 4, 8, 7};
        double count = 0;
        for(int i =0; i<srednee.length; i++){
            count += srednee[i];
        }
        count = count/ srednee.length;
        System.out.println("Среднее арифметическое = " + count);
    }
}
