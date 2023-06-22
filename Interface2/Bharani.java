package Trichy;

public class Bharani implements Govt,FranceGovt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bharani bb = new Bharani();
		
		bb.follow_traffic_rules();
		
		System.out.println(Bharani.NO_HELMET_FINE);
		bb.play();
		
		//Dynomic Method 
		Govt traffic_police = new Bharani();
		traffic_police.follow_traffic_rules();
		
		FranceGovt gg = new Bharani();
		gg.keep_visa();
		
		Central_Govt obj = new Bharani();
		
		obj.go_by_flight();
		
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

	

	@Override
	public void keep_visa() {
		// TODO Auto-generated method stub
		System.out.println("Keepvisa");
	}

	@Override
	public void go_by_flight() {
		// TODO Auto-generated method stub
		System.out.println("Go to the flight");
	}

}
