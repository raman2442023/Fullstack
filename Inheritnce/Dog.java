package project.com;

public class Dog extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		
		Cat c= new Cat();
		
		
		d.eat();
		d.bark();
		c.meow();
				
	}
	
	void bark()
	{
		System.out.println("Barking");
	}

}
