package project.com;

public class DogFamily extends BabyDog{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
DogFamily dogobj = new DogFamily();
		
		dogobj.eat();
		
		dogobj.weep();
		
		dogobj.bark();
		
	}
	
	void accesing()
	{
		System.out.println("Accesing");
	}
	
	void bark()
	{
		System.out.println("Barked");
	}

}
