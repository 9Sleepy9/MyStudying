package Chapter_13.StackQuestion;

interface IGenStack <T> {

    void push(T obj) throws FullStackException;

    T pop() throws EmptyStackException;
}
