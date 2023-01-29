package Chapter_9;

class NonIntResultException extends Exception{

    int n;
    int d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }

    public String toString(){
        return ("��������� �������� " + n + " / " + d
                + " �� �������� ����� ������");
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
                + " ����� " + x[i]/y[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("������� ������� �� 0!");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("��������������� ������� �� ������");
            }
            catch (NonIntResultException exc){
                /*����� ���������� ��������� �� ������, ������������� toString() �� �����������,
                    �.�. ������ ����� ���������� �� ��������� ��� ������������� println()*/
                System.out.println(exc.toString());
            }
        }
    }
}
