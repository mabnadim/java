
package lab;

import java.util.Scanner;
public class AreaOfCircle {
   public static void main(String args[]){
      int radius;
      double r,area1, area2, sq_area, pi=3.1416,result;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle ::");
      radius = sc.nextInt();
      area1 = radius*radius;
      r = (Math.sqrt(2)*radius)/2;
      area2 = pi*r*r;
      sq_area = area2-area1;
       result = sq_area/4;
       System.out.println("The result of dotted area is::"+ result);
   }
}