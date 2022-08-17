package hierarchicalStudy;

public class HierarchicalStudy {

	public static void main(String[] args) {

		Dog d=new Dog (); 
		d.voice();
		d.eat();
		
		System.out.println("============");
		
		Cat c=new Cat();
		c.name();
		c.eat();
		
		System.out.println("==============");
	
		
		Rabbit r=new Rabbit();
		r.run();
		r.eat();
		
		System.out.println("===========");
		Cat.drink();
		Dog.colour();
		Rabbit.bark();
		Cat.sleep();
		Dog.sleep();
		Rabbit.sleep();
		
	}

}
