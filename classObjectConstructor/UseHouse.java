package classObjectConstructor;

	
public class UseHouse {
	public static void main (String[] args) {

	House myHouse = new House("Tauhid's House"); // creating new object to call the blueprint 
												// constructor
	
	System.out.println("housename= "+ myHouse.houseName); //printing housename
	
	
	myHouse.kitchen(); //calling kitchen method
	myHouse.bathRoom(); //calling bathroom method
	myHouse.room(); //calling room method
	
	}
}
