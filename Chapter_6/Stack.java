package Chapter_6;

class FullStackException extends Exception {

    public String toString(){
        return ("\nОшибка! Стек переполнен");
    }
}

class EmptyStackException extends Exception {

    public String toString(){
        return ("\nОшибка! Стек пуст");
    }
}

class StackWork {
    private long stack [];
    private int point = 0;


    StackWork (int d){
        System.out.println("Создан стек из " + d + " мест");
        stack = new long[d];
        point = -1;
    }

    StackWork(int mas []){

        stack = new long[mas.length];
        for (int i = 0; i < mas.length; i++) stack [i] = mas [i];
        point = stack.length - 1;
        System.out.println("Полученный стек: ");
        for(long x: stack)
            System.out.print(x + " ");
        System.out.println();
    }

    StackWork(long ... x) {
        stack = x;
        point = stack.length - 1;
    }

    StackWork(StackWork ob){
        point = ob.point;
        stack = new long[ob.stack.length];
        for (int i = 0; i < ob.stack.length; i++){
            stack[i] = ob.stack[i];
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    void push(int a) throws FullStackException {
        try {
            if (point + 1 < stack.length) {
                point++;
                stack[point] = a;
                System.out.println("Добавлен элемент номер " + (point + 1) + ": " + stack[point]);

            } else throw new FullStackException();
        }
        catch (FullStackException exc){
            System.out.println(exc);
        }
    }

    long pop() throws EmptyStackException {
        try {
            if (point >= 0) {
                System.out.println("Вывод элемента номер " + (point + 1) + ": " + stack[point]);
                return stack[point--];
            } else throw new EmptyStackException();
        }
        catch (EmptyStackException exc){
            System.out.println(exc);
        }
        return 0;
    }

    long[] popAll() throws EmptyStackException {
        long x[] = new long[point];
        try {
            while (point >= 0) {
                ;
                System.out.println("Вывод элемента номер " + (point + 1) + ": " + stack[point]);
                point--;
            }
            throw new EmptyStackException();
        }
        catch (EmptyStackException exc){
            System.out.println(exc);
        }
        return x;
    }
}


public class Stack {

    public static void main (String args[]){

        System.out.println("Без входных данных: ");
        StackWork MyStack1 = new StackWork(10);
        try {
            MyStack1.push(111);
            MyStack1.pop();
            System.out.println();
        }
        catch (EmptyStackException | FullStackException exc) {}

        System.out.println("Задан стек из переменных: ");
        StackWork MyStack2 = new StackWork(1, 2, 3, 4, 5);
        try {
            MyStack2.push(222);
            MyStack2.pop();
            MyStack2.push(222);
            System.out.println();
        }
        catch (EmptyStackException | FullStackException exc) {}

        System.out.println("На основе существующего стека: ");
        StackWork MyStackCopy = new StackWork(MyStack2);
        try {
            MyStackCopy.push(123);
            MyStackCopy.popAll();
            System.out.println();
        }
        catch (EmptyStackException | FullStackException exc) {}

        System.out.println("Задан стек из массива данных: ");
        int array[] = {5, 7, 2, 4, 9};
        StackWork MyStack3 = new StackWork(array);
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
        catch (EmptyStackException | FullStackException exc) {}

    }

}
