package Chapter_9;

class ExcTest{

    static void genException(){

        //��������� ���������� � ������ ������ � � ������ main()
        try {
            int nums[] = new int[4];
            System.out.println("�� ��������� ����������");
            nums[7] = 10;
            System.out.println("��� ������ �� ����� ��������");
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
            System.out.println("����������� ���������: ");
            System.out.println(exc);
            System.out.println("\n���� �������: ");
            //����� ������ ������ Throwable, ������-�� � ����� ����� ���������
            exc.printStackTrace();
        }
        System.out.println("����� ����� catch");
    }
}
