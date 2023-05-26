class Area
{
public static void main(String[] args)
{
Area square=new Area();
Area rectangle=new Area();
int result=square.calcluate(40);
System.out.println(result);

result=rectangle.calcluate(40,30);
System.out.println(result);
}
int calcluate(int len,int br)
{
return len*br;
//System.out.println(len*br);
}

int calcluate(int a)
{
return a*a;
}


}
