package oops.abstraction;

public class Honda extends ModernCar implements Car, Motor {
    public void start() {           // belong to car interface
        System.out.println("Honda start= Keyless car");
    }

    public void stop() {        //belong to car interface
        System.out.println("Honda Stop= auto stop");
    }

    public void engine() {      //belong to motor interface
        System.out.println("Honda engine =v8");
    }


    public void fuel() {        //belong to motor interface
        System.out.println("Honda fuel =gas");
    }

    public void navigation(){       //belong to Honda class
        System.out.println("Honda navigation= gps system integration");
    }

    public void autoRadio(){        //belong to Honda class
        System.out.println("Honda autoRadio= included");
    }

    public void hydraulicBrake() { //belong to abstract class ModernCar
        System.out.println("ModernCar hydraulicBrake= Hydraulic Brake Car");
    }
}
