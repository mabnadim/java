package lab;

abstract class A {
    abstract void text();
}

class B extends A {
    void text(){
        System.out.println("This is an example of Abstract Class");
    }
}

public class Abs {
    public static void main(String[] args) {
        B m;
        m = new B();
        m.text();
    }
}
