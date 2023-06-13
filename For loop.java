class ForLoop
{

public static void main(String[]args)
{
ForLoop loopobj = new ForLoop();

loopobj.pramid();

   
    for(int i=1;i<=5;i++){  
    for(int j=1;j<=i;j++){  
            System.out.print("* ");  
    }  
    System.out.println();//new line  
    }  
     
      

}

private void pramid()
{

    int term=6;  
    for(int i=1;i<=term;i++){  
    for(int j=term;j>=i;j--){  
            System.out.print("* ");  
    }  
    System.out.println();//new line  
    }  
      
      


}

}
