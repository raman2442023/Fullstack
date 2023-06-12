class Perfect
{

    public static void main(String[]args)
      {

        Perfect perfectobj=new Perfect();

        perfectobj.find_diviser(28);
      } 

private void find_diviser(int num)

    {   
        int div=1;
        int sum=0;
        int mul=1;
while(div<num)
{
   if(num%div==0)
    {
        sum= sum+div;
     
        mul=mul*div;
      
    } 
   div=div+1;
}
if (sum==num && mul==num)
    {
        System.out.println("Perfect Number  ");
    }
else
    {
        System.out.println("Not Perfect Number");
    }

}


}

