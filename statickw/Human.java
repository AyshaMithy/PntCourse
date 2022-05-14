package statickw;

public class Human {
	
	
	// Static can be applicable to any attributes. 
	
	int height;			// non-static variable
	static int weight; // static variable
	
	public void person1() {	// non static method- can use both static and non static variables. 
		height= 6; 
		weight= 180; 
		
	}
	
	public static void person2() { //static method- can only use static variables. 
		//height = 5;
		weight = 170; 
	}

}
