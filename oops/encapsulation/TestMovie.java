package oops.encapsulation;

public class TestMovie {

	public static void main(String[] args) {
		 
		Movie movie= new Movie(); 
		
		//movie.name = "Batman"; - can not access because name is a private variable. 
		
		movie.setName ("Batman");  //using setter because name is private variable
		System.out.println ("moviename= "+ movie.getName ());		// printing "name" using getter. 

	}
}
