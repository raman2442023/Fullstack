package home.work;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers tasks = new Numbers();
		tasks.asend();
		System.out.println();
		tasks.task2();
		System.out.println();
		tasks.task3();
		System.out.println();
		tasks.task5();
		System.out.println();
		tasks.task6();
		System.out.println();
		tasks.task7();
		System.out.println();
		
		
	}

	private void task3() {
		// TODO Auto-generated method stub
		int num=2;
		while (num<=30)
			{
				num=num+2;
				System.out.print(num);
			}
	}

	private void task2() {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		while(num1<=30)
		{
			num1=num1+2;
			System.out.print(num1 +" ");
		}
	}

	private void task7() {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3=2;
		while(num1<=30)
		{
			num1=num1+1;
			num2=num2+1;
			num3=num3+1;
			
			System.out.println(num1+"*"+num2+"*"+num3+"="+num1*num2*num3);
			
		}
	}

	private void task6() {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		while (num1<=30)
		{
			num1=num1+1;
			num2=num2+1;
			System.out.println(num1+"*"+num2+"="+num1*num2);
		}
	}

	private void task5() {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		while (num1<=30)
		{
			num2=num2+1;
			num1=num1+num2;
			System.out.print(num1 +" ");
		}
		System.out.print(num1);
	}

	private void asend() {
		// TODO Auto-generated method stub
		int num =0;
		while (num<=9)
		{
			num=num+1;
			System.out.print(num + " ");
		}
	}

}
