package nadim;
import java.util.Scanner;
 class Prime {
   public static void main (String[] args)
   {		
      Scanner sc = new Scanner(System.in);
      int num =0;
      String  primeNumbers = "";
      System.out.println("Enter the value of lower:");
      int k =sc.nextInt();
      System.out.println("Enter the value of higher:");
      int n = sc.nextInt();
      sc.close();
      for (int i = k; i <= n; i++)  	   
      { int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    //Appended the Prime number to the String
	    primeNumbers = primeNumbers + i + " ";
	 }}	
      System.out.println("Prime numbers from "+ k +" to "+ n +" are:");
      System.out.println(primeNumbers);
   }
}