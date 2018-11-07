package nadim;

import java.util.Scanner;

public class Area {

    double Area(int a) {
        return (a * a);
    }

    double Area(int a, int b) {
         return (b * Math.PI * (2 * a / 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = sc.nextInt();
        Area ar = new Area();
        System.out.println("Area of Square is: " + ar.Area(a));
        System.out.println("Area of Circle is: " + ar.Area(a, 2));
        double result = (ar.Area(a, 2) - ar.Area(a));
        System.out.println("Area of part is: " + result);
    }
}
