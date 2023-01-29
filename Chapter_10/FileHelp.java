package Chapter_10;

import java.io.*;

class Help {

    String helpfile;

    Help (String hf) {
        helpfile = hf;
    }

    public void helpon (String what) {

        int ch;
        String topic = "";
        String info = null;

        if (what == null || what.equals("")) {
            System.out.println("������, ������� ���������� ��������");
            return;
        }

        try ( BufferedReader helpRdr = new BufferedReader( new FileReader(helpfile)) ) {

            do {
                ch = helpRdr.read();
                if (ch == '#')
                    topic = helpRdr.readLine();

                if (topic.contains(what)) {
                    System.out.println(topic);
                    do {
                        info = helpRdr.readLine();
                        if (info == null || info.contains("#")) break;
                        System.out.println(info);
                    } while (true);
                    ch = -1;
                }
            } while (ch != -1);
        }
        catch (FileNotFoundException exc) {
            System.out.println("���� �� ������: " + exc);
        }

        catch (IOException exc) {
            System.out.println("������ �����-������: " + exc);
        }

        if (info == null && !what.equals("stop"))
            System.out.println("���� �� �������");
    }


    String getSelection () {
        String topic = "";
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        System.out.println("������� ���� ��� ������: ");

        try {
            topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("������ ��� ������ � �������");
        }

        return topic;
    }
}

public class FileHelp {

    public static void main(String[] args) {
        Help helpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("������ ��������� ��������� ����� � ���������� �������." +
                "\n��� ������ �� ��������� �������: 'stop'");

        do {
            topic = helpobj.getSelection();
            helpobj.helpon(topic);
        } while (!topic.equals("stop"));
    }
}
