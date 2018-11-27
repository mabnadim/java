package nadim;

import java.util.Scanner;

class Binomial {

    static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoeff(n - 1, k - 1)
                + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value for k: ");
        int k = sc.nextInt();
        System.out.printf("Value of C(%d, %d) is %d ", n, k, binomialCoeff(n, k));
    }
}