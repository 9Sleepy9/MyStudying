package Chapter_13.StackQuestion;

class EmptyStackException extends Exception {

    public String toString(){
        return ("\nОшибка! Стек пуст");
    }
}
