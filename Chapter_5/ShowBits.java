package Chapter_5;

public class ShowBits {
    int numbits;

    //Сколько битов будем отображать
    ShowBits (int n){
        numbits = n;
    }

    //Вывод двоичных значений
    void show(long val){
        long mask = 1;

        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>=1){
            if ((val & mask)!= 0) System.out.print("1");
            else System.out.print(0);

            //Разделение результата по 8 бит
            spacer++;
            if ((spacer % 8) == 0){
                System.out.print(" ");
                spacer =0;
            }
        }
        System.out.println();
    }

    //Демонстрация Работы
    public static void main(String args[]){
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном представлении (8): ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении (32): ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении (64): ");
        li.show(237658768);

        //Также можно взять избыточное число битов (или недостаточное)
        System.out.println("\n123 в двоичном представлении (32): ");
        i.show(123);
    }
}
