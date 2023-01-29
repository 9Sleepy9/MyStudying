package Chapter_6;

class Sum{
    private int x [];

    Sum (int ... a) {
        x = new int[a.length];
       for (int i = 0; i < a.length; i++) x[i] = a[i];
    }

    /*Sum (int b, int ... a) {
        System.out.print("Неоднозначность");
    }*/

    int sum(){
        int s = 0;
        for (int c : x) s+= c;
        return s;
    }

}

class StringRec{
    private String x;
    private char c;
    private int b;

    StringRec(String a){
        b = a.length() - 1;
        x = a;
    }

    void strec(){
        c = x.charAt(b);
        System.out.print(c);
        b--;
        if (b >= 0) strec();
    }
}

class Test {
    int a;

    Test (int i) { a = i; }

    void swap(Test copy1, Test copy2){
        int x;
        x = copy1.a;
        copy1.a = copy2.a;
        copy2.a = x;
        System.out.println("test1: " + copy1.a + "\ntest2: " + copy2.a);
    }
}

public class Questions {

    public static void main(String args[]){
        int s;
        Test test1 = new Test(2);
        Test test2 = new Test(3);

        //test1.swap(test1, test2);


        //StringRec str = new StringRec("Hello, World!");
        //str.strec();

        Sum test = new Sum(1, 2, 3, 4);
        s = test.sum();
        System.out.println("Сумма: " + s);
    }

}
