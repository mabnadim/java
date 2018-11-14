
package Tutorial;
import java.util.Scanner;
public class Scant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int sum=0;
        for(int i=0; i<a.length; i++){
            a[i] =sc.nextInt();
        }
        for (int j=0;j<a.length;j++){
            sum+=a[j];
        }
        System.out.println(sum);
    }
}
