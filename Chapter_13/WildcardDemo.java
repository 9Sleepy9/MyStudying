package Chapter_13;

class NumericFns2<T extends Number> {

    T num;

    NumericFns2(T n){
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    // Ћибо подобное объ€вление метода также доспустимо
    // boolean absEqual(NumericFns2<? extends Number> obj) { ...
    boolean absEqual(NumericFns2<?> obj) {
        double first = Math.abs(num.doubleValue());
        double second = Math.abs(obj.num.doubleValue());

        if (first == second) {
            System.out.println("In absolut these objects are equal");
            return true;
        }
        else {
            System.out.println("In absolut these objects are NOT equal");
            return false;
        }
    }
}

public class WildcardDemo {
    public static void main(String[] args) {

        NumericFns2<Integer> iObj = new NumericFns2<>(10);
        NumericFns2<Double> dObj = new NumericFns2<>(10.0);
        NumericFns2<Long> lObj = new NumericFns2<>(9L);

        iObj.absEqual(dObj);
        iObj.absEqual(lObj);
    }
}
