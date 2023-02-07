package PolymorphismDemo;

public class Car2 implements Car{
    private boolean running;
    private final boolean speedmode = false;

    @Override
    public int serialNumber() {
        return 98767321;
    }

    @Override
    public void start() {
        running = true;
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("Машина 'Car2' остановилась");
    }

    @Override
    public String getName() {
        return "Машина№2";
    }

    public boolean speedmode() {
        return speedmode;
    }
}
