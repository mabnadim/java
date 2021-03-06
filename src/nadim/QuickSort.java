package nadim;

import java.util.Scanner;

public class QuickSort {

    private int array[];
    private int length;

    public void Sort(int inputArray[]) {
        if (inputArray == null || inputArray.length == 0) {
            return;
        }
        this.array = inputArray;
        this.length = inputArray.length;
        Quicksrt(0, length - 1);

    }

    private void Quicksrt(int low_idx, int high_idx) {
        int i = low_idx;
        int j = high_idx;
        //locate pivot position
        //int pivot = array[low_idx + (high_idx - low_idx) / 2];
        int pivot = array[i];

        //array partition control
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                //swap location value
                Exchange(i, j);
                // change position
                i++;
                j--;
            }
        }
        //recursive function calling to change position after swaping 
        if (low_idx < j) {
            Quicksrt(low_idx, j);
        }
        if (high_idx > i) {
            Quicksrt(i, high_idx);
        }
    }

    private void Exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort srt = new QuickSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:\n");
        int n = sc.nextInt();
        int input[] = new int[n];
        System.out.println("Enter " + n + " Elements:\n");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("Array Before Quick Sort");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\n");
        //quck sorting
        srt.Sort(input);
        //again retrive data from sorted array
        System.out.println("Array After Quick Sort");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
