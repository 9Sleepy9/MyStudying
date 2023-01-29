package Chapter_9;

class FixedQueue implements ICharQ {

    //Сама простая очередь
    private char q[];

    //Указатели для добавления и извлечения из очереди
    private int putloc, getloc;

    //Конструктор, в нём мы создаём новую очередь
    public FixedQueue(int size){
        q = new  char[size];
        putloc = getloc = 0;
    }

    //Переопределённый метод put(), обязательно должны быть указаны все обрабатываемые проверяемые исключения после throws
    //Здесь исключение мы выдаём вручную, с помощью соответствующего условия и ключевых слов throw new
    public void put(char ch) throws QueueFullException {
        //Если очередь заполнена
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        //Добавление символа
        q [putloc++] = ch;
    }

    //Переопределённый метод get(), всё аналогично с put()
    public char get() throws QueueEmptyException{
        //Если индексы извлечения и добавления равны, значит в очереди ничего не осталось
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }

}

public class QueueExcDemo {

    public static void main(String args[]){

        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                System.out.println("Попытка сохранения: " + (char) ('A' + i));
                q.put( (char) ('A' + i) );
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i ++){
                System.out.print("Получение очередного символа: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
