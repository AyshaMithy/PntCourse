package classobjectmethod;

import java.util.Scanner;

public class Calculator {
	//java class is a blueprint.
	//may or may not be executable. 
	
	
	//class attributes-variables
	int number1=10; //global variables
	int number2=25; 
	
	//class attributes-methods: a reusable block of code that runs when called
	
	//syntax for method: methodtype methodName(){codes to execute}
	
	int addition() {		// method creation
		int add_total=number1+number2; //function
		return add_total; //return 
	}
	
	
	void sub() {			//void method= no return method
		int sub_total=number2-number1;
		System.out.println("sub_total from void= "+ sub_total);
	}
	
	//surface=length*width;
	 double surface() {
		 double surface=number1 * number2;
		 return surface;
	 }
		 
	// temp convert
		int cToF(int c) {		//parameterized method
			int f = (c * 9/5) + 32; 
			return f;
		
		 
	 }
		// string with scanner
		
		String name() {
			Scanner sc = new Scanner(System.in); 
			System.out.println("What is your Name?");
			String myName= sc.nextLine();
			return myName; 
			}
	
	
}
