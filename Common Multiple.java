class Common{

    public static void main(String[]args)
    {

        Common multiple = new Common();

        multiple.find_common_multiple_number(3,5);
        multiple.find_lcm(24,54);
        multiple.swap_without_box(23,88);
        multiple.febinocis();



        }

private void find_common_multiple_number(int num1,int num2)

{

int big=num1>num2?num1:num2;
int temp=big;
 
     while(true)
        {
            if (big%num1==0 && big%num2==0)
                {

                    System.out.println("The common multiple is "+big);
                        break;

                }
            big=big+temp;
           
        }
        
}

private void find_lcm(int no1,int no2)
{

    int box=no1;

    no1=no2;
    no2=box;

    System.out.println(no1);
    System.out.println(no2);

}

private void swap_without_box(int num1,int num2)
{

    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;

    System.out.println(num1);
    System.out.println(num2);


}
private void febinocis()
{


    int a=0;
    int b=1;
while(a<=20)
{
    int c=a+b;
    System.out.println(a);
    a=b;
    b=c;

}



}

}
