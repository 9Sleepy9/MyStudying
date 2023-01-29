package Chapter_9;

public interface ICharQ {

    //Добавлены исключения для корректной работы кода, т.к. переопределённые методы
    // не могут иметь дополнительных исключений (не обозначенных в супер-классе)
    void put (char ch) throws QueueFullException;

    char get() throws QueueEmptyException;

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
