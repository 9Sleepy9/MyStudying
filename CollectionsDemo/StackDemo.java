package CollectionsDemo;

import java.util.*;

/**
 * Данный класс всё ещё не устарел (вроде),
 * но лучше будет использовать ArrayDeque
 */

public class StackDemo {

    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("Стек: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("Стек: " + st);
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        System.out.println("Стек: " + st);

        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException exc) {
            System.out.println("Стек пуст");
        }
    }
}
