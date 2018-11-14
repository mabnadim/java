    package lab;

    class Add {

        Add(int x, int y) {
            System.out.println(x + y);
        }

        Add(int x, int y, int z) {
            System.out.println(x + y + z);
        }
    }

    public class Method_Overloading {

        public static void main(String args[]) {
            Add a1 = new Add(5, 10);
            Add a2 = new Add(5, 10, 5);
        }
    }
