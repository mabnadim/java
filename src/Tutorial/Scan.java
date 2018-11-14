
package Tutorial;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  int[] array = new int[5];
  for (int i=0; i<array.length;i++){
      //System.out.println("Enter "+ array.length +" number sequencely");
      System.out.println("Enter digit, "+ (i+1) +" number is remaining");
      array[i] = sc.nextInt();
  }
  int sum=0;
  for (int j=0; j<array.length; j++){
      //System.out.println(array[j] );
      sum += array[j];
  }
  System.out.println("Result is:" +sum );
    }
}
