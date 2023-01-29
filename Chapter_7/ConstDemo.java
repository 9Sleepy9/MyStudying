package Chapter_7;

class ErrorMsg{

    static final int OUTERR = 0;
    static final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        return "Несуществующий код ошибки";
    }

}

public class ConstDemo {
    public static void main(String args[]){

        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(ErrorMsg.OUTERR));
        System.out.println(err.getErrorMsg(ErrorMsg.INERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
        System.out.println(err.getErrorMsg(err.INDEXERR));
        System.out.println(err.getErrorMsg(5));
    }
}
