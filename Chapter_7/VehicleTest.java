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

    //������� ������������ ����������
    int range() {
        return mpg * fuelcap;
    }

    //������� ������� ��� ����������� ��������� ����
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    //������ ������� � ���������� ������
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

        //���������� � ����� ��� Semi
        gallons = semi.fuelneeded(dist);
        System.out.println("�������� ����� ���������: " + semi.GetCargoCap() + " ������.");
        System.out.println("��� ����������� " + dist + " ���� ��������� ��������� " + gallons + " �������� �������.\n");

        //���������� � ����� ��� pickup
        gallons = pickup.fuelneeded(dist);
        System.out.println("����� ����� ���������: " + semi.GetCargoCap() + " ������.");
        System.out.println("��� ����������� " + dist + " ���� ������ ��������� " + gallons + " �������� �������.\n");

        //���������� � ����� ��� offroader
        gallons = offroader.fuelneeded(dist);
        System.out.println("�������� ������� � ������������: " + offroader.GetGroundClearance() + " ������.");
        System.out.println("��� ����������� " + dist + " ���� ������������ ��������� " + gallons + " �������� �������.\n");
    }
}