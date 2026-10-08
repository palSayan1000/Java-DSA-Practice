package object_oriented_programming.oop_5.interfaces;

public class Main {
    static void main() {
//        Car car = new Car();
        Engine car2 = new Car();
//        Engine car3 = new Engine(); // interface obj cannot be created
        int temp = car2.a; // can access this
        // as this above accesability depends on (Engine car3)
        // and which methods can be accessed depends on the (new Car()) part
        // which version to access will be mentioned by the object
        // what to access will be on the reference type
//        System.out.println(temp);
//        car.acc();
//        car.stop();
//        car.start();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
    }
}
