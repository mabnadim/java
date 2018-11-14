
package Interface;


class Exc extends Exception {
    Exc(String s){
        super(s);
    }
    static void validate(int age) throws Exc {
        if(age<18)
            throw new Exc("Under Age Voter.");
        else
            System.out.println("Welcome to vote");
    }
}

public class My {
    public static void main(String[] args) {
      try{
          Exc.validate(20);
      }
      catch(Exc e){
          System.out.println(e);
      }
        
    }
}
