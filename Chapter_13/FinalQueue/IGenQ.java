package Chapter_13.FinalQueue;


public interface IGenQ <T> {

    void put (T element) throws QueueFullException;

    T get () throws QueueEmptyException;
}
