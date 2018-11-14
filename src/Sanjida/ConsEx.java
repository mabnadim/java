
package Sanjida;

public class ConsEx {
    private int x;

    // constructor
    private ConsEx(){
        System.out.println("Constructor Called");
        x = 5;
    }

    public static void main(String[] args){
        ConsEx obj = new ConsEx();
        System.out.println("Value of x = " + obj.x);
    }
}


