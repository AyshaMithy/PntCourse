package oops.abstraction;

public class TestCar {
    public static void main(String[] args) {
        Toyota corolla = new Toyota();      //accessing the Class Toyota with
                                            // start, stop, engine, fuel
        corolla.start(); //from interface car.
        corolla.stop();  //from interface car.
        corolla.engine();   //from interface motor.
        corolla.fuel();     //from interface motor.

        Honda civic= new Honda(); // accessing the Class Honda with
                                    // start, stop, engine, fuel, navigation and autoRadio
        civic.start();
        civic.stop();
        civic.engine();
        civic.fuel();
        civic.autoRadio();
        civic.navigation();

        // cannot create a object of interface: Car accord= new Car(); is invalid.
        Car accord=new Honda(); //accessing the interface car with start and stop only
        accord.start();
        accord.stop();

    }
}
