package Chapter_9;

class ExcTest{

    static void genException(){

        //Обработка исключения в данном методе и в методе main()
        try {
            int nums[] = new int[4];
            System.out.println("До генерации исключения");
            nums[7] = 10;
            System.out.println("Эта строка не будет выведена");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            throw e;
        }
    }
}

public class UseThrowableMethods {

    public static void main(String args[]){

        try{
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек Вызовов: ");
            //Вызов метода класса Throwable, почему-то в самом конце программы
            exc.printStackTrace();
        }
        System.out.println("После блока catch");
    }
}
