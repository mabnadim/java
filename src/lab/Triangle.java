
package lab;
import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        double s1, s2, degree, radian, pi=3.1416, height, area; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first side :"); 
        s1 = s.nextDouble();
        System.out.print("Enter the second side :"); 
        s2 = s.nextDouble();
        System.out.print("Enter the angle:"); 
        degree = s.nextDouble();
        radian = degree * pi / 180;
        height = Math.sin(radian)*s1;
        area = 0.5 * s2 * height;
        System.out.print("Area of Triangle is:"+area+" sq units");
    }
}
