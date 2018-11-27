package nadim;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}