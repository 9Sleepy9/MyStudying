package Chapter_5;

public class PhoneBook {

    public static void main (String args []){
        String book [] [] = {
                {"Mom", "525-385-764"},
                {"Dad", "582-495-374"},
                {"Brother", "692-983-872"},
                {"Sister", "495-537-254"}
        };

        int i;
        if (args.length != 1) System.out.println("Error Occurred\n" + "Usage: java PhoneBook <Name>\n");
        else {
            for (i = 0; i < book.length; i++) {
                if ( book [i][0].equals(args[0]) ) {System.out.println(book[i][0] + ": " + book[i][1]); break;}
                else if (i == book.length-1) System.out.println("Not found");
            }
        }
    }

}
