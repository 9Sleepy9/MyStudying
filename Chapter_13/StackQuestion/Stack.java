package Chapter_13.StackQuestion;


public class Stack {

    public static void main (String args[]){

        System.out.println("Задан стек из массива данных: ");
        Integer[] array = {5, 7, 2, 4, 9};
        StackWork<Integer> MyStack3 = new StackWork<>(array);
        try {
            MyStack3.pop();
            MyStack3.push(333);
            MyStack3.pop();
            MyStack3.pop();
            MyStack3.push(333333);
            MyStack3.popAll();
            MyStack3.push(-333);
            System.out.println();
        }
        catch (EmptyStackException | FullStackException exc) {
            System.out.println(exc);
        }

        System.out.println();

        // Стек на основе существующего
        Integer[] intStore = new Integer[5];
        StackWork<Integer> MyStack4 = new StackWork<>(intStore, MyStack3);

        try {
            System.out.println("Содержимое MyStack4: ");
            MyStack4.popAll();
        } catch (EmptyStackException exc) {
            System.out.println(exc);
        }

    }

}
