package statickw;

public class UserHuman {

	public static void main(String[] args) {

		Human human= new Human();
		
		human.person1(); // non-static attributes can be accessed via the object only.
		
		Human.person2();// static attributes can be accessed via class only. 
						//	no need to create an object.
		
		
		
	}

}
