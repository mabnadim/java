package lab;
// This is Parameterrized Constructor

class Constructor {

    int id;
    String name;

    Constructor(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Constructor St1 = new Constructor(174, "Mohammed Amran Bhuiyan");
        Constructor St2 = new Constructor(222, "Aziz Akram");
        St1.Display();
        St2.Display();
    }
}
