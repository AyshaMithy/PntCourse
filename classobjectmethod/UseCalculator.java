package classobjectmethod;

public class UseCalculator {

	public static void main(String[] args) {
	
		//object: is an instance of a class
		
		//syntax to create new object:  Classname objectName= new ClassName();
		
		Calculator add= new Calculator(); //calling the class
		
		int myTotal= add.addition(); //storing the value in myTotal
		System.out.println("addition= "+ myTotal);// printing 
		
		/* void mySub = add.sub();		we used void so cant call
		System.out.println("sub= "+ mySub);*/
		
		add.sub(); //instead call sysout it in the blue print and call method here. 
		
		double mySurf = add.surface();
		System.out.println("Surface= " + mySurf);
		
		int temp= add.cToF(23); // parameterized method
		System.out.println("Celcius to farenheit = "+ temp);
		
		String st=add.name();
		System.out.println("Hi "+ st+ " welcome to JAVA!");
	}
}