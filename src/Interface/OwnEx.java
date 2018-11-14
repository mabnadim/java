
package Interface;

class MyEx extends Exception{
     MyEx(String s2){
         System.out.println(s2);
         //super(s2);
    }
    
    static void validate(int age) throws MyEx{
        if(age < 18)
            throw new MyEx("Under age Voter");
        else
            System.out.println("Welcome to vote");   
    }
}

public class OwnEx {
    
    public static void main(String[] args) {
        
        try{
          MyEx.validate(25);
        }
        catch(MyEx e){
            System.out.println(e);
        }
    }
}
