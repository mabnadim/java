
package nadim;
import java.util.Scanner;

class SumSeries { 
public static void main(String[] args) 
{ 
    Scanner sc = new Scanner(System.in);  
    int sum =0;
    System.out.println("Enter the size of element:\n");
    int n = sc.nextInt();
    for(int i=0; i<=n; i++){
        for(int j=0; j<=i; j++){
            sum += j;
        }
    }
    System.out.println("Sum is:"+ sum);
} 
} 