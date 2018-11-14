
    package lab;

    class stc {

        static int multiply(int x, int y) {
            int z = x * y;
            return (z);
        }
    }

    public class Static_Keyword {

        public static void main(String[] args) {
            int z = stc.multiply(5, 5);
            System.out.println("Multiplication is: " + z);
        }
    }