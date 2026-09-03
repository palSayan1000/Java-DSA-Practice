package object_oriented_programming.oop_5.interfaces;

public class NiceCar {
    private Engine engine;
    private final Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine obj) {
        engine = obj;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startPlayer() {
        player.start();
    }

    public void stopPlayer() {
        player.stop();
    }
    // same as set engine
    public void updateEngine(Engine engine) {
        this.engine = engine;
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        this.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
