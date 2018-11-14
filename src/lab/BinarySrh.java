package lab;

import java.util.Scanner;

public class BinarySrh {

    public static void bubbleSort(int array[]) {
        int n = array.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public static void Search(int array[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
                //System.out.println("first: " +first + "\n");
            } else if (array[mid] == key) {
                System.out.println("Element " + key + " is found at index: " + (mid + 1));
                break;
            } else {
                last = mid - 1;
                // System.out.println("last: " +last + "\n");
            }
            mid = (first + last) / 2;
            //System.out.println("mid: " +mid + "\n");
        }
        if (first > last) {
            System.out.println("Element " + key + " is not Found!");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:\n");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " Elements:\n");
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        BinarySrh.bubbleSort(array);
        System.out.println("Enter value for search:\n");
        int first = 0;
        int last = array.length - 1;
        int key = sc.nextInt();
        
        BinarySrh.Search(array, first, last, key);
        
    }
}
