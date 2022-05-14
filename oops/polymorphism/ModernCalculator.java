package oops.polymorphism;

public class ModernCalculator extends Calculator {
	
	@Override
	public int sub (int x, int y) { //override method - same method name, 
									//same parameters but different body
		int total= x-y+10;
		return total;
		
	}

}
