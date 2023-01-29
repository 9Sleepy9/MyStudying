package Chapter_7;

class Vehicle {

    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Считаем максимальное расстояние
    int range() {
        return mpg * fuelcap;
    }

    //Считаем топливо для преодоления заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    //Методы доступа к переменным класса
    int GetPassengers() { return passengers; }
    void SetPassengers (int p) { passengers = p; }

    int GetFuelCap() { return fuelcap; }
    void SetFuelCap(int f) { fuelcap = f; }

    int GetMpg() { return mpg; }
    void SetMpg(int m) { mpg = m; }

}

class Track extends Vehicle{

    private int cargocap;

    Track(int p, int f, int m, int c){
        super (p, f, m);
        cargocap = c;
    }

    int GetCargoCap() { return cargocap; }
    void SetCargoCap(int c) { cargocap = c; }

}

class OffRoad extends Vehicle {

    private int GroundClearance;

    OffRoad(int p, int f, int m, int g) {
        super (p, f, m);
        GroundClearance = g;
    }

    int GetGroundClearance() { return GroundClearance; }
    void SetGroundClearance(int g) { GroundClearance = g; }

}

public class VehicleTest {
    public static void main (String args[]){

        Track semi = new Track (2, 200, 7, 44000);
        Track pickup = new Track (3, 28, 15, 2000);
        OffRoad offroader = new OffRoad(5, 25, 12, 5);
        double gallons;
        int dist = 252;

        //Вычисления и вывод для Semi
        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти: " + semi.GetCargoCap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        //Вычисления и вывод для pickup
        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти: " + semi.GetCargoCap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.\n");

        //Вычисления и вывод для offroader
        gallons = offroader.fuelneeded(dist);
        System.out.println("Дорожный просвет у внедорожника: " + offroader.GetGroundClearance() + " дюймов.");
        System.out.println("Для преодоления " + dist + " миль внедорожнику требуется " + gallons + " галлонов топлива.\n");
    }
}