package Trichy;

public class Bharani implements Govt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bharani bb = new Bharani();
		
		bb.follow_traffic_rules();
		
		System.out.println(Bharani.no_helmet_fine);
		bb.play();
		
		//Dynomic Method 
		Govt traffic_police = new Bharani();
		traffic_police.follow_traffic_rules();
		
	}
	
	public void play()
	{
		System.out.println("play badminton");
	}

	@Override
	public void follow_traffic_rules() {
		// TODO Auto-generated method stub
		
		System.out.println("Two wheeler Rules");
	}

}
