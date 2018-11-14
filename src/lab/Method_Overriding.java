package lab;

class Bank {

    int interest() {
        return 0;
    }
}

class Prime_Bank extends Bank {

    int interest() {
        return 9;
    }
}

class Bank_Asia extends Bank {

    int interest() {
        return 10;
    }
}

public class Method_Overriding {

    public static void main(String args[]) {
        Prime_Bank Prime = new Prime_Bank();
        Bank_Asia Asia = new Bank_Asia();
        System.out.println("Prime Bank loan interest is:" + Prime.interest() + "%");
        System.out.println("Bank Asia loan interest is:" + Asia.interest() + "%");
    }
}
