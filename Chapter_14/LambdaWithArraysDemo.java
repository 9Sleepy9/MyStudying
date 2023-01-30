package Chapter_14;


interface MyArrayTransform<T> {

    void func(T[] n);
}
public class LambdaWithArraysDemo {

    public static void main(String[] args) {

        MyArrayTransform<Double> mat = (n) -> {
            for (int i = 0; i < n.length; i++) {
                n[i] = Math.sqrt(n[i]);
                //System.out.println(n[i]);
            }
        };

        Double[] da = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        System.out.println("Changing array: ");
        mat.func(da);
        for (double x : da)
            System.out.println(x);
    }
}
