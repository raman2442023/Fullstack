package home.work;

public class Samsung extends FactoryDemo{
	
	static int price=5000;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung sam = new Samsung();
		
		sam.browse();
		sam.providpattern();
		sam.verififingerprint1();
		System.out.println(sam.price);
	}

	@Override
	void verififingerprint1() {
		// TODO Auto-generated method stub
		System.out.println("Verified");
	}

	@Override
	void providpattern() {
		// TODO Auto-generated method stub
		System.out.println("Provied");
	}

}
