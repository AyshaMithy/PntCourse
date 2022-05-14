package oops.abstraction;

public abstract class ModernCar { //Abstract class is a hybrid class
                                    // can have both abstract method and normal method
                                    // to implement use key word "extends"
                                    //for internal memory abstract class is faster and interface is slower
                                    // abstract can hold final or regular variable, private public all kind of variables
                                    // can not create any instance of abstract class, Means no Constructor.


    public abstract void hydraulicBrake();  //abstract method

    public void autolock(){         // non-abstract method
        System.out.println("ModernCar autoLock= Autolock after 10secs");
    }



}
