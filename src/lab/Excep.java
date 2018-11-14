
package lab;

public class Excep {
    public static void main(String[] args) {
        
    }
    public void show (){
        try{
            System.out.print(1/0);
        }
        catch(Exception e){
            System.out.println("Caught Exception");
        }
        finally {
            System.out.println("This is a Exception test program");
        }
    }
}
