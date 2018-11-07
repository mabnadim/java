
package nadim;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0, n;
        System.out.println("Enter the size of array:\n");
        n = sc.nextInt();
        int input[] = new int[n];
        System.out.println("Enter " + n + " Elements:\n");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("Array data:");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
          System.out.println("\n");
        
        System.out.println("Binaries are: ");
        for (int i = 0; i < input.length; i++) {
            if(i%2 != 0){
                count +=1;
                System.out.print(input[i] +" ");
            }
        }
        System.out.println("\n");
        System.out.println("Total: " + count);
    }
}
