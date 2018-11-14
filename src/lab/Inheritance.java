
    package lab;

    class Employee {

        int salary = 40000;
    }

    class Bonus extends Employee {

        float bonus = 10000;
    }

    class Increment extends Bonus {

        double increment = 10000;
    }

    public class Inheritance {

        public static void main(String[] args) {
            Increment Inc = new Increment();
            System.out.println("Programmer salary is: " + Inc.salary + " Tk.");
            System.out.println("Programmer Bonus is: " + Inc.bonus + " Tk.");
            System.out.println("Programmer Increment is: " + Inc.increment + " Tk.");
        }
    }