package nadim;
import java.util.Scanner;

class NCR { 
 static int nCr(int n, int r) { 
    return fact(n) / (fact(r) *fact(n - r)); 
} 
// Returns factorial of n 
static int fact(int n) 
{ 
    int res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 

public static void main(String[] args) { 
    int n, r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n: \n");
    n = sc.nextInt();
    System.out.println("Enter value of r: \n");
    r = sc.nextInt();
    
    System.out.println(n+"C"+r+" "+"is :" +NCR.nCr(n, r));
    } 
} 