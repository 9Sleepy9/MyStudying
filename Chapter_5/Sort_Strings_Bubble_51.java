package Chapter_5;

public class Sort_Strings_Bubble_51 {

    //От большего к меньшему
    /*
    void sort (String str[]){
        String t;

        for (int x = 1; x < str.length; x++){
            for (int i = 0; i < x; i++){
                if (str[i+1].compareTo(str[i]) > 0) {
                    t = str[i + 1];
                    str[i + 1] = str[i];
                    str[i] = t;
                }
            }
        }
    */

        //От меньшего к большему
        void sort (String str[]){
            String t;
            for (int x = 1; x < str.length; x++){
                for (int i = str.length-1; i >= x; i--){
                    if (str[i-1].compareTo(str[i]) > 0) {
                        t = str[i - 1];
                        str[i - 1] = str[i];
                        str[i] = t;
                    }
                }
            }

        System.out.println("Отсортированный массив: ");
        for(String i : str)
            System.out.println(" " + i);
        System.out.println();
        }

    public static void main (String args[]){
        String str [] = {"Hello", "My Name is Artem", "I am Student", "!"};

        System.out.print("Исходный массив: ");
        for (String i : str){
            System.out.print(" | " + i);
        }
        System.out.println();

        Sort_Strings_Bubble_51 b = new Sort_Strings_Bubble_51();
        b.sort(str);
    }
}
