package project.com;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Rectangle();
		
		Shape ss = new Circle();
		
		ss.draw();
		s.draw();
	}
	
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}

}
