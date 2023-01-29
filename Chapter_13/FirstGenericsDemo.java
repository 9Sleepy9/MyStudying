package Chapter_13;

class Gen <T> {

    T obj;

    Gen (T ob) {
        obj = ob;
    }

    T getobj() {
        return obj;
    }

    void showType() {
        System.out.println("Тип 'T' в данном случае - это " + obj.getClass().getName());
    }
}

public class FirstGenericsDemo {
    public static void main(String[] args) {

        // Создание объекта типа Integer на основе обобщённого класса
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();

        // Здесь происходит автораспаковка
        int v = iOb.getobj();
        System.out.println("Значение v: " + v);

        System.out.println();

        // Также объект можно создать и таким способом
        Gen<String> strOb = new Gen<>("Тестирование обобщений (Generics)");

        strOb.showType();

        String str = strOb.getobj();
        System.out.println("Значение str: " + str);
    }
}
