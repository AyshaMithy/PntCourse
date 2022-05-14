package oops.polymorphism;

public class Calculator {

	public int add(int x, int y) {
		int total= x+y;
		return total;
	}
	
	//polymorphism- same named method with different parameters 
	
	public int add (int x, int y, int z) {	//overloading method- same method name with 
											//different parameters.
											// compile time polymorphism
		int total= x+y+z;
		return total;
	}
	
	public int sub(int x, int y) {
		int total= x-y;
		return total;
		
		
//Override method is in ModernCalculator sub-class. 
//Override uses the annotation @Override, use same method name, same parameters,but different body
//Override is run time polymorphism 		
	}
}
