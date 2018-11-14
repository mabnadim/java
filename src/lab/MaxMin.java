package lab;
import java.util.Scanner;
class Max {

    public int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}
class Min {
    public int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
public class MaxMin {
    public static void main(String[] args) {
        Max Mx = new Max();
        Min Mn = new Min();
        Scanner sc = new Scanner(System.in);
        int i, n, a[];
        System.out.println("Enter the number of elements:\n");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " elements:\n");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Maximum Value in Array is: " + Mx.getMaxValue(a));
        System.out.println("Minimum Value in Array is: " + Mn.getMinValue(a));
    }
}
