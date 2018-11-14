package nadim;
import java.util.*;
class SumEle
{
    static void printpairs(int arr[],int sum)
    {       
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && s.contains(temp))
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            s.add(arr[i]);
        }
    }
    public static void main (String[] args)
    {
        int A[] = {2,5,10,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:\n");
        int n = sc.nextInt();
        printpairs(A,  n);
    }
}