    package Interface;
    interface A {
       int sum (int x, int y);
    }
    interface E{
       int sub (int x, int y);
       int mul (int x, int y);
       int div (int x, int y);
    }
     class B implements A, E{
        public int sum (int x , int y){
            return (x+y);
        }
        public int sub (int x , int y){
            return (x-y);
        }
        public int mul (int x , int y){
            return (x*y);
        }
        public int div (int x , int y){
            return (x/y);
        }
    }
    public class Interface {
        public static void main(String[] args) {
            B add = new B();
            A sum;
            sum = add;
            E eq;
            eq = add;
            System.out.println("Summation is:" + sum.sum(20, 10));
            System.out.println("Subtraction is:" + eq.sub(20, 10));
            System.out.println("Multiplication is:" + eq.mul(20, 10));
            System.out.println("Division is:" + eq.div(20, 10));  
        }
    }
