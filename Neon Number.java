class Neon
{
    
    public static void main(String[]args)
        {
        Neon neonobj = new Neon();
       int num=30;
        int neon=neonobj.find_sqre_number(num);
         int result=neonobj.sum_of_digit(neon);
       if (result==num)
            {
                System.out.println("Neon number");
            }
        else
            {
                System.out.println("Not Neon number");
            }

       }
    private int find_sqre_number(int num)
        {
             num=num*num;
            // System.out.println(num);
        return num;
        }
    private int sum_of_digit(int no)
        {
            
            int sum=0;
            while(no>0)
                {
                    int rem=no%10;
                     no=no/10;
                     sum=sum+rem;   
                    
                }
                //System.out.println(sum);
                return sum;
            
        }        
            
}            
                
                     
                    
                      
                       
                    
      
            



             
    




