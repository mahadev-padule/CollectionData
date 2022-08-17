package inheritanceStudy;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Mother m= new Mother();// create a object of mother class 
		
		Son s = new Son();// create a object of son class 
		
		m.nature(); // using mother object to calling method 
		s.mobile();//using son object to calling son method 
		s.nature();//using son object to calling mother method 
		
		
		Mother.look();//mother calling its own static method
		Son.laptop();//son callig its own static method 
		Son.look();//son calling mother static method

	}

}
