
package nadim;
import java.util.*;
 
public class CountingSort{
 
  public static int[] sort(int[] array) {
  
    int[] aux = new int[array.length];
 
    // find the smallest and the largest value
    int min = array[0];
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      } else if (array[i] > max) {
        max = array[i];
      }
    }
 
    // init array of frequencies
    int[] counts = new int[max - min + 1];
 
    // init the frequencies
    for (int i = 0;  i < array.length; i++) {
      counts[array[i] - min]++;
    }
 
    // recalculate the array - create the array of occurences
    counts[0]--;
    for (int i = 1; i < counts.length; i++) {
      counts[i] = counts[i] + counts[i-1];
    }
 
    for (int i = array.length - 1; i >= 0; i--) {
        aux[counts[array[i] - min]--] = array[i];
    }
 
    return aux;
  }
 
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array:\n");
  int n = sc.nextInt();
   int [] unsorted = new int [n];
   System.out.println("Enter the array element:\n");
   for(int i=0; i<unsorted.length; i++){
       unsorted[i] = sc.nextInt();
   }
//int [] unsorted = {5,3,0,2,4,1,0,5,2,3,1,4}; 
    System.out.println("Before: " + Arrays.toString(unsorted));
 
    int [] sorted = sort(unsorted);
    System.out.println("After:  " + Arrays.toString(sorted));
  }
}