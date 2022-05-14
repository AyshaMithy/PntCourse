package classObjectConstructor;

public class House {
	
	//class attribute- variable
	int adress;
	String houseName;
	char unit;
	
	//class attribute- method
	
	void kitchen() {
		System.out.println("Kitchen= "+ "food");
	}
	
	void room() { 
		System.out.println("Room= "+ "sleep");
	}
	
	void bathRoom() {
		System.out.println("Bathroom= " +"sing");
	}
	
	
	//class attribute - Constructor
	// constructor is a block of code similar to method used to initialize object
	
	House(String myHouseName){ // constructor initialized- always has the same name as classs
		houseName= myHouseName; 
	}

}
