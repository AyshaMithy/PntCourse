package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor {

    public void start() {               // the methods created in the car interface are implemented here.
        System.out.println("Toyota start= Turn the key to start");
    }

    public void stop() {
        System.out.println("Toyota stop= Break and stop");
    }

    public void engine() {      // the methods created in motor interface are implemented here.
        System.out.println("Toyota engine= v6");
    }

    public void fuel() {
        System.out.println("Toyota fuel= dissel");
    }

    public void hydraulicBrake() {

    }
}
