package MyOwnQuests;

class InDataError extends Exception {

    public String toString() {
        return "Ошибка во входных данных";
    }
}


interface Converter {

    double getConvertedValue(double baseValue, char ch) throws InDataError;

}


class Celsius implements Converter {

    static {
        System.out.println("Для перевода из цельсия в кельвины/фаренгейты введите температуру и целевую шкалу ('K' или 'F')\n");
    }

    public double getConvertedValue(double baseValue, char ch) throws InDataError {
        switch (ch){
            case 'K':
                return baseValue + 273.15;

            case 'F':
                return 1.8 * baseValue + 32;
            default:
                throw new InDataError();
        }
    }
}


class Kelvin implements Converter {

    public double getConvertedValue(double baseValue, char ch) throws InDataError {
        switch (ch){
            case 'C':
                return baseValue - 273.15;

            case 'F':
                return 333;
            default:
                throw new InDataError();
        }
    }
}


class Fahrenheit implements Converter {

    public double getConvertedValue(double baseValue, char ch) throws InDataError {
        switch (ch){
            case 'C':
                return 111;

            case 'K':
                return 222;
            default:
                throw new InDataError();
        }
    }
}


public class BaseConverter {

    public static void main(String[] args) {

        Celsius Cel = new Celsius();
        Kelvin Kel = new Kelvin();
        Fahrenheit Far = new Fahrenheit();

        try {
            System.out.println( Cel.getConvertedValue(30, 'K') );
            System.out.println( Cel.getConvertedValue(30, 'F') );
            System.out.println( Kel.getConvertedValue(400, 'С') );
            System.out.println( Far.getConvertedValue(500, 'S') );
        }
        catch (InDataError exc) {
            System.out.println(exc);
        }
    }
}
