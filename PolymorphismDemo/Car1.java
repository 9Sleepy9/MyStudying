package PolymorphismDemo;

public class Car1 implements Car {
    private boolean isRunning;
    private int doors = 5;
    @Override
    public int serialNumber() {
        return 1789234;
    }

    @Override
    public void start() {
        isRunning = true;
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    @Override
    public String getName() {
        return "Машина№1";
    }

    int getDoors() {
        return doors;
    }
}
