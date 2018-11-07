package nadim;
import java.util.*;
 
class SumElement{
     static boolean hasArrayTwoCandidates(int A[], 
                           int arr_size, int sum)
    {
        int l, r;
     
        Arrays.sort(A);
     
        l = 0;
        r = arr_size-1; 
        while (l < r)
        {
            if(A[l] + A[r] == sum){
                return true;
            }
                
            else if(A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        } 
        return false;
    }
 
    public static void main(String args[])
    {
        int A[] = {2,5,10,20};
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value:\n");
        int n = sc.nextInt();
        int arr_size = A.length;

        if(hasArrayTwoCandidates(A, arr_size, n))
System.out.println("Array has two " + 
                  "elements with given sum: " +n);

        else
            System.out.println("Array doesn't have " +
                               "two elements with given sum: " +n);
     
    }
 
}
