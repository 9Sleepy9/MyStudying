package Chapter_8.qpack;

//Обычная очередь фиксированного размера
public class FixedQueue implements ICharQ {

    public char q[];
    private int putloc, getloc;

    //Создание пустой очереди
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Добавление символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь Заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    //Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь Пуста");
            return (char) 0;
        }

        return q[getloc++];
    }


    public void reset() {
        putloc = getloc = 0;
    }

}
