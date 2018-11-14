package lab;

import java.util.Scanner;

public class TNStackClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TNStack tns = new TNStack(3);
        
        // push some elements
        if (!tns.isFull()) {
            System.out.println("Enter the Push Element:\n");
            int n = sc.nextInt();
            tns.push(n);
        }
        if (!tns.isFull()) {
            System.out.println("Enter the Push Element:\n");
            int n = sc.nextInt();
            tns.push(n);
        }
        if (!tns.isFull()) {
            System.out.println("Enter the Push Element:\n");
            int n = sc.nextInt();
            tns.push(n);
        }
        if (!tns.isFull()) {
            System.out.println("Enter the Push Element:\n");
            int n = sc.nextInt();
            tns.push(n);
        } else {
            System.out.println("Stack is full, cannot push element");
        }

        // pop some elements
        if (!tns.isEmpty()) {
            tns.pop();
        }
        if (!tns.isEmpty()) {
            tns.pop();
        }
        if (!tns.isEmpty()) {
            tns.pop();
        }
        if (!tns.isEmpty()) {
            tns.pop();
        } else {
            System.out.println("Stack is empty, cannot pop element");
        }

        //reinsert to verify peek method
        if (!tns.isFull()) {
            System.out.println("Again Enter the Push Element:\n");
            int n = sc.nextInt();
            tns.push(n);
        }
        // peek couple of times; result should be same
        tns.peek();
        tns.peek();
    }
}
