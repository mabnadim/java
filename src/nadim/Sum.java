
package nadim;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0, r=0;
        System.out.println("Enter the element size:\n");
        n = sc.nextInt();
        
        for (int i =0; i<=n; i++){
            sum +=i;
        }
        
        System.out.println("Sum is: "+ sum);      
    }
}
