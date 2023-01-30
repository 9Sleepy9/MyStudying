package Chapter_14;
import java.io.*;

// Functional interface
interface MyIOAction {
    boolean ioAction (Reader rdr) throws IOException;
}
public class LambdaExceptionDemo {

    public static void main(String[] args) {

        // Just an example, not working now!
        // Lambda can throw IOException, so ioAction method also must throw it
        MyIOAction MyIO = (rdr) -> {
            System.out.println("Give me a letter");
            int ch = rdr.read();
            if (Character.isLetter((char) ch)) {
                System.out.println("You gave me: " + (char) ch);
                return true;
            }
            else {
                System.out.println("ch is not a number!");
                return false;
            }
        };
    }
}
