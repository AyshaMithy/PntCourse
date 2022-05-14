package oops.abstraction;

public interface Car {

    // these are abstract methods
    //interface can only be abstract methods
    // by default interface has public method
    //interface can be extended to another interface
    //any declared value for variable in interface is final value, therefore can not be reassigned or overwritten.
    //for internal memory abstract class is faster and interface is slower

    public void start();     // interface - you can not start a method, only declare your highlight of the program
    public void stop();
}
