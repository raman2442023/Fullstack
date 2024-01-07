class ArrayDemo{

    public static void main(String[] args){


    int[] ar ={1,2,3,5};

    int n =ar.length+1;

    
    int sum = n*(n+1)/2;

    int sum2=0;  
    for(int i=0;i<ar.length;i++){
          sum2 = sum2+ar[i]; 
}int ans = sum-sum2;
System.out.println("The missing num is "+ans);

}

}


