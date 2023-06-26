package home.work;

import java.util.Scanner;

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Theatre Raja = new Theatre();
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter the amount");
		int Amount=	sc.nextInt();
	
	
		int balance=Raja.bookDetails(Amount);
		
		System.out.println("After booking ticket "+balance);
	}

	private int bookDetails(int amount) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the price");
		int Ticket_price= sc.nextInt();
		
		
		int price=amount-Ticket_price;
		
		return price;
	}

}
