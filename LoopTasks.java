class Looping{

static int num=2344;
public static void main(String[]args)
{


 Looping problems = new Looping();
    
int result=problems.find_amstrong(num);
int sum_result=problems.amstrong(result);

if (sum_result==num)
{
System.out.println("It's Amstrong number");
}
else
{
System.out.println("It's Not Amstrong number");
}
/*
int num=60;
int mul=0;
while(mul<=num)
{

if (mul%3==0 && mul%5==0)
{
System.out.println(mul);

}
mul=mul+1;

}

int no=16;
int div=2;
while(div<no/2)
{
if (no%div==0)
{
System.out.println(div);

}
div=div+1;

} 
int num=100;
int div=1;
int count=0;
int sum=0;
while (div<=num/2)
{
if (num%div==0)
{
System.out.println(div);
count=count+1;
sum=sum+div;
}
div=div+1;

}  
System.out.println(count);    
System.out.println(sum);



int num=1234;
int div=1000;
int count=0;
int sum=0;
while(num>0)
{
	System.out.println(num%div);
	num=num%div;
	div=div/10;
}
System.out.println(count);
System.out.println(sum);
*/
}


private int find_amstrong(int num)
{

int count=0;
while(num>0)
{
int rem=num%10;
count=count+1;
num=num/10;

}
System.out.println(count);

return count;
}


private int amstrong(int count)
{
int sum=0;

while (num>0)
{
System.out.println(num%10*count);
sum=sum+num;
num=num/10;

}
System.out.println(sum);

return sum;

}


}


