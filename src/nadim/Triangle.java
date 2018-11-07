package nadim;

import java.util.Scanner;

public class Triangle {

    double Triangle(int a, int b, int c) {
        return ((a * b * Math.sin(c)) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.print("Enter the value of C:");
        int c = sc.nextInt();
        Triangle tr = new Triangle();
        System.out.print("Area of Triangle is is: " + tr.Triangle(a, b, c));
    }
}
