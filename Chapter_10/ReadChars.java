package Chapter_10;

import java.io.*;

public class ReadChars {

    public static void main(String[] args) throws IOException {

        char ch;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        System.out.println("����� ������ �����������. " +
                "����� ����� - ������ '.' ");

        do {
            ch = (char) br.read();
            System.out.println(ch);
        } while (ch != '.');

        System.out.println("����� ������ ���������");
    }
}
