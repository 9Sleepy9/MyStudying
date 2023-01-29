package Chapter_13.StackQuestion;

class FullStackException extends Exception {

    int size;

    FullStackException (int s) { size = s; }

    public String toString(){
        return ("\nОшибка! Стек переполнен. Максимальный размер стека: " + size);
    }
}
