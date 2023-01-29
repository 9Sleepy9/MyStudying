package Chapter_5;

public class NoZeroDiv {
    public static void main (String args[]){
        int result;
        for (int i = -5; i < 6; i++){

            //Первый Вариант:
            if (i !=0 ? true : false)
                System.out.println("Результат деления числа 100 на " + i + " равен " + 100/i);

            //Второй Вариант:
            result = i!=0 ? 100/i : 0;
            if (i!=0) System.out.println("100/i = " + result);
        }
    }
}
