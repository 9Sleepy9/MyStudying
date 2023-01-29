package Chapter_9;

public class MultiCatch {

    public static void main(String args[]){

        int a = 88; int b =0;
        int result;
        char chrs[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++){
            try{

                if (i == 0)
                    result = a / b;

                else
                    chrs[5] = 'X';

            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Перхваченное исключение: " + exc);
            }
            finally {
                System.out.println("Проход № " + (i+1));
            }
        }

        System.out.println("После группового перехватчика исключений");
    }
}
