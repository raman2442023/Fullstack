package home.work;

public abstract class FactoryDemo extends SmartPhone{
	
	boolean orignalpiese=false;
	
	static int price=0;
	
	abstract void verififingerprint1();
	
	abstract void providpattern();
	
	void browse()
	{
		System.out.println("Factory demo browsing");
	}

	@Override
	int call(int second) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Sending Message");
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("Receiveing call");
	}

	
		
	

}
