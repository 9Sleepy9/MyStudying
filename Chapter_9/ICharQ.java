package Chapter_9;

public interface ICharQ {

    //��������� ���������� ��� ���������� ������ ����, �.�. ��������������� ������
    // �� ����� ����� �������������� ���������� (�� ������������ � �����-������)
    void put (char ch) throws QueueFullException;

    char get() throws QueueEmptyException;

    default void reset(){

    }

    //��� �������� ���� Public
    static void QueueCopy(char q1[], char q2[]){
        System.out.println("���������� ������: ");
        for (int i = 0; i < q1.length; i++) {
            q2[i] = q1[i];
            System.out.print(q2[i] + " ");
        }
    }

}
