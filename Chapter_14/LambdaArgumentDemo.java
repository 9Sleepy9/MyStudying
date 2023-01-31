package Chapter_14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface StringFunc {
    String func(String str);
}
public class LambdaArgumentDemo {

    static String changeStr (StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) throws IOException {

        String inStr;
        String outStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Give me a line: ");
            inStr = br.readLine();

        System.out.println("Incoming string (or line): " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("Reversed string: " + outStr);

        System.out.println();

        //Replacing all 'spaces' for '-'
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("String with changed 'spaces' to '-': " + outStr);

        System.out.println();

        // For Chapter questions:
        outStr = changeStr((str) -> str.replaceAll(" ", ""), inStr);
        System.out.println("String with deleted 'spaces': " + outStr);

        // Reversing letters case - It is bad example, because code became harder,
        // in such case it is better to use variable for Lambda
        outStr = changeStr( (str) -> {
            String result = "";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }

            return result;
        }, inStr);

        System.out.println("String with reversed letters case: " + outStr);
    }
}
