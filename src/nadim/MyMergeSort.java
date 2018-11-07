package nadim;
import java.util.Scanner;

public class MyMergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of Array: \n");
         int n = sc.nextInt();
         System.out.println("Enter "+ n + " Elements: \n");
         int [] inputArr = new int [n];
         for(int i = 0; i<n; i++){
             inputArr[i] = sc.nextInt();
         }
        System.out.println("Array Before Merge Sort:\n");
        for(int i=0; i<inputArr.length; i++){
        System.out.print(inputArr[i]+ " ");
        }
        System.out.println("\n");
         
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        System.out.println("Array After Merge Sort:\n");
        for(int i=0; i<inputArr.length; i++){
        System.out.print(inputArr[i]+ " ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            //int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            int middle = (lowerIndex + higherIndex ) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}