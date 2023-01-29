package Chapter_8;

public interface IVehicle {

    int range();

    double fuelneeded(int miles);

    int GetPassengers();
    void SetPassengers (int p);

    int GetFuelCap();
    void SetFuelCap(int f);

    int GetMpg();
    void SetMpg(int m);

}
