package nadim;
import java.lang.Math; 
import java.util.Scanner;

class Dosum { 
static double sum(int x, int n) 
{ 
    double i, total = 1.0; 
    for (i = 1; i <= n; i++) 
        total = total +  
                (Math.pow(x, i) / i); 
  
    return total; 
}

public static void main(String[] args) 
{ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x:\n");
    int x = sc.nextInt();
    System.out.println("Enter the value of n:\n");
    int n = sc.nextInt(); 
    System.out.printf("%.2f", sum(x, n)); 
} 
} 
