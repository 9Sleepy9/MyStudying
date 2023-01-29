package Chapter_9;

class NonIntResultException extends Exception{

    int n;
    int d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return ("Результат операции " + n + " / " + d
                + " не является целым числом");
    }

}

public class CustomExceptDemo {

    public static void main(String args[]) {
        int x[] = {2, 5, 8, 10, 12, 14, 20};
        int y[] = {1, 2, 0, 3, 6, 0};

        for (int i = 0; i < x.length; i++) {
            try{
                if ( ((double) x[i]/y[i]) > (x[i]/y[i]) )
                    throw new NonIntResultException(x[i], y[i]);

                System.out.println(x[i] + " / " + y[i]
                + " равно " + x[i]/y[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("Попытка деления на 0!");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Соответствующий элемент на найден");
            }
            catch (NonIntResultException exc){
                /*Вывод кастомного сообщения об ошибке, использование toString() не обязательно,
                    т.к. данный метод вызывается по умолчанию при использовании println()*/
                System.out.println(exc.toString());
            }
        }
    }
}
