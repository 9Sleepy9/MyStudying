package Chapter_5;

public class Simple_Encrypt {

    //Шифруем
    String encryption (String message, String key){
        String encmsg = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++){
            encmsg += (char) (message.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.println("Encrypted Message: " + encmsg);
        return encmsg;
    }

    //Дешифруем
    String decryption (String encmsg, String key){
        String decmsg = "";
        int j = 0;
        for (int i = 0; i < encmsg.length(); i++){
            decmsg += (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.println("Decrypted Message: " + decmsg);
        return decmsg;
    }

    public static void main (String args[]){
        String encmsg = "";
        String decmsg = "";
        String msg = "";
        String key = "12345678";

        //Проверка длины строки
        if (args.length > 0) {

            //Объединяем слова в один объект
            for (int i = 0; i < args.length; i++) {
                msg += args[i] + " ";
            }
            System.out.println("Sent Message: " + msg);

            //Вызываем методы (Шифруем/Дешифруем)
            Simple_Encrypt Test = new Simple_Encrypt();
            encmsg = Test.encryption(msg, key);
            decmsg = Test.decryption(encmsg, key);

        }
        //Если строка пуста
        else System.out.println("Error: Line is Empty!");
    }
}