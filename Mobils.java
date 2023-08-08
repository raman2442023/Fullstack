package com.org;

public class Mobils {
	
	String brand;
	int price,ram;
	float screenSize;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobils m1 = new Mobils("Oppo",20000,6,5.6f);
		Mobils m2 = new Mobils("Oppo",20000,6,5.6f);
		
		System.out.println(m1.equals(m2));
	}

	public Mobils(String brand, int price, int ram, float screenSize) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.screenSize = screenSize;
	}
	
	public boolean equals(Object obj)
	{
		Mobils m=(Mobils)obj;
		
		if(this.brand==m.brand)
			if(this.price==m.price)
				if(this.ram==m.ram)
					if(this.screenSize==m.screenSize)
						return true;
		return false;
	}

	
}
