package oops.encapsulation;

public class Movie {
	
	private String name; // global variable is only accessible within class. 
						// private variable can not be accessible outside class. 
						// Encapsulation is data hiding
	int duration;
	String popCorn;
	
	
	
	public void setName(String name) { // setter method- non returnable, 
										// has a parameter name
		this.name= name; // whenever we assign a value to this.name 
							// only using this.name for the same variable name convention. 
							// do no use this.name if you can use different variables. 
							// we are setting the value to the global variable
		
		
	}
	
	public String getName() { // getter method
		return name;
	}
	

}
