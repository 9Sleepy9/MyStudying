public class Chapter3 {
    public static void main (String args []){
        int i;
        int j=0;
        for (i = 2; i<=100; i++){
            if ((i % 2) == 0) {
                j++;
                System.out.println(i + " - чётное число");
            }
        }
        System.out.println("\nКоличество чётных чисел от 2 до 100: " + j);
        System.out.println("\nОдин\nДва\nТри");
    }
}