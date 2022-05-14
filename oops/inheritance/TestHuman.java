package oops.inheritance;

public class TestHuman {

	public static void main(String[] args) {

		Father jack= new Father();
		jack.athletic(); 
		jack.height();
		jack.rich();// inheriting from GrandGather
		jack.communicate(); //inheriting from Grandfather-Animal
		
		Child kevin= new Child();
		kevin.athletic(); // only accessible once child was extended with father class
		kevin.height(); // only accessible once child class was extended with father class
		kevin.rich();// inheriting from father-GrandFather
		kevin.communicate(); //inheriting from father-Grandfather-Animal 
		
		
		GrandFather bob= new GrandFather();  
		bob.rich();
		bob.communicate(); //Inheriting from Animal
		
		Bird sparrow= new Bird();
		sparrow.communicate();	//inheriting from Animal
	}

}
