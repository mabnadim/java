
package nadim;
import java.util.Scanner;
public class Factorial {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,input, fact = 1;
        System.out.println("Enter the value::");
        input = sc.nextInt();
        fact = factorial(input);
        System.out.println("Factorial of " + input + " is: " + fact);
    }
}
