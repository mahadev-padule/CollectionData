package multilevelStudy;

public class Multilevel {

	public static void main(String[] args) {
		
		Son s1= new Son();
		
		s1.look();
		s1.voice();
		s1.mobile();
		
		Son.hair();
		Son.money();
		Son.laptop();

		Father f=new Father();
		f.look();
		f.voice();
		
		
		Father.hair();
		Father.money();
	
	}

}
