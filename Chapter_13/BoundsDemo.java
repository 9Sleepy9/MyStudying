package Chapter_13;

// ����������� ��������� �����-���������� �� ������ Number � ��� ����������
class NumericFns <T extends Number> {

    T num;

    NumericFns (T num) {
        this.num = num;
    }

    // �������� �������� ��� ��������� �����
    double reciprocal() {
        return ( 1 / num.doubleValue() );
    }

    // ������� ����� ��������� �����
    double fraction() {
        return ( num.doubleValue() - num.intValue() );
    }
}


// ����������� ������������� ������� T � V
class Pair<T, V extends T> {

    T first;
    V second;

    Pair (T a, V b) {
        first = a;
        second = b;
    }
}

public class BoundsDemo {

    public static void main(String[] args) {

        NumericFns<Number> numN = new NumericFns<>(10);
        System.out.println("�������� �������� numN: " + numN.reciprocal());
        System.out.println("������� ����� numN: " + numN.fraction());

        System.out.println();

        NumericFns<Double> numD = new NumericFns<>(12.29);
        System.out.println("�������� �������� numD: " + numD.reciprocal());
        System.out.println("������� ����� numD: " + numD.fraction());

        // �� �������������
        // NumericFns<String> ...

        System.out.println();

        Pair<Number, Double> p1 = new Pair<>(10, 13.3);
        Pair<Integer, Integer> p2 = new Pair<>(5, 7);
        // �� �������������, �.�. Byte �� ��������� Double, ����� �������� ��� 'T' ������ ���� 'Number'
        // Pair<Double, Byte> p3 ...
    }
}
