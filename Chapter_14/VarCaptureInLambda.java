package Chapter_14;


interface MyFunc {
    int func(int n);
}
public class VarCaptureInLambda {

    public static void main(String[] args) {

        // This variable is automatically 'final' to be used in lambda
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; - prohibited, cuz 'num' is 'final'
            return v;
        };

        System.out.println(myLambda.func(8));

        // num = 9; - it is also prohibited!
    }
}
