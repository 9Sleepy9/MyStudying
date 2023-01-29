package Chapter_13.StackQuestion;

class StackWork <T> implements IGenStack <T> {
    private T stack [];
    private int point = 0;

    // Создать стек на основе массива
    StackWork(T [] stackArray){
        stack = stackArray;
        point = stack.length - 1;
        System.out.println("Полученный стек: ");
        for(T x: stack)
            System.out.print(x + " ");
        System.out.println();
    }

    // Создать стек с начальными значениями
    StackWork(T[] stackArray, T[] a) {
        stack = stackArray;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (FullStackException exc) {
                System.out.println(exc);
            }
        }
    }

    // Создать стек на основе другого стека
    StackWork(T[] stackArray, StackWork<T> otherStack){
        point = otherStack.point;
        stack = stackArray;

        try {
            if (stack.length < otherStack.stack.length)
                throw new FullStackException(stack.length);
        } catch (FullStackException exc) {
            System.out.println(exc);
        }

        for (int i = 0; i < point; i++){
            stack[i] = otherStack.stack[i];
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


    public void push(T a) throws FullStackException {
        try {
            if (point + 1 < stack.length) {
                point++;
                stack[point] = a;
                System.out.println("Добавлен элемент номер " + (point + 1) + ": " + stack[point]);

            } else throw new FullStackException(stack.length);
        }
        catch (FullStackException exc){
            System.out.println(exc);
        }
    }

    public T pop() throws EmptyStackException {
        try {
            if (point >= 0) {
                System.out.println("Вывод элемента номер " + (point + 1) + ": " + stack[point]);
                return stack[point--];
            } else throw new EmptyStackException();
        }
        catch (EmptyStackException exc){
            System.out.println(exc);
        }
        return null;
    }

    T[] popAll() throws EmptyStackException {
        try {
            while (point >= 0) {
                System.out.println("Вывод элемента номер " + (point + 1) + ": " + stack[point]);
                point--;
            }
            throw new EmptyStackException();
        }
        catch (EmptyStackException exc){
            System.out.println(exc);
        }
        return stack;
    }
}
