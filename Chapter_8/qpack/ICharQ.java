package Chapter_8.qpack;


public interface ICharQ {


    void put (char ch);

    char get();

    default void reset(){

    }

    //Для массивов типа Public
    static void QueueCopy(char q1[], char q2[]){
        System.out.println("Полученный массив: ");
        for (int i = 0; i < q1.length; i++) {
            q2[i] = q1[i];
            System.out.print(q2[i] + " ");
        }
    }

}