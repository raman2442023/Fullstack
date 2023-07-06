package project.com;

public class BabyDog extends Dog{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog dd = new BabyDog();
		
		dd.bark();
		dd.eat();
		dd.weep();
		
	}
	
	void weep()
	{
		System.out.println("Wepping");
	}

}
