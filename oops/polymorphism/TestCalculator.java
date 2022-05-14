package oops.polymorphism;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		
		int addition = cal.add(52, 85);
		System.out.println("addition= "+ addition);
		
		
		int subtraction= cal.sub(46, 36);
		System.out.println("subtraction= "+ subtraction);
	
}
	
}
