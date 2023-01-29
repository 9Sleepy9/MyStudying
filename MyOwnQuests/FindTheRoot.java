package MyOwnQuests;

public class FindTheRoot {


    /*public static double FindRoot () {
        //double x[] = new double[10000];
        double c = 0;
        double y;
        for (int i = 0; i < 10000; i++) {
            c += 0.001;
            //x[i] = c;
            //y = ( Math.cos(x[i] * x[i] * x[i] * x[i] * x[i]) + x[i]*x[i]*x[i]*x[i] - 345.3*x[i] - 23 );
            y = Math.cos(Math.pow(c, 5)) + Math.pow(c, 4) - 345.3*c - 23;
            if (y == 0)
                return c;
            if (i == 9000)
                System.out.println(9000);
        }
        return c;
    }

    public static void main(String[] args) {

        double x = FindRoot();

        System.out.println("Корень = " + x);
    }*/

    // вспомогательный метод
    public static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    // решить уравнение
    public static double  solve(double start, double end){
        if(end - start <= 0.001){
            System.out.println("Точность достигнута");
            return start;
        }

        double x = start + (end - start) / 2;

        if(func(start) * func(x) > 0){
            System.out.println("Рекурсия 1");
            return solve(x, end);
        } else {
            System.out.println("Рекурсия 2");
            return solve(start, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }

}
