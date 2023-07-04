package home.work;

public abstract class SmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	abstract int call(int second); 
		
	
	abstract void sendMessage();
	
	abstract void receiveCall();
	
	void browse()
	{
		System.out.println("Smartphone Browsing");
	}
	
	public SmartPhone()
	{
	System.out.println("Smartphone under development");
	}
	
}
