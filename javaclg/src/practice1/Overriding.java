package practice1;

// Base class
class Payment {
    void pay() {
        System.out.println("Payment is processing");
    }
}

// Derived class: Credit Card
class CreditC extends Payment {
    void pay() {
        System.out.println("Payment is done through Credit Card");
    }
}

// Derived class: UPI
class UPI extends Payment {
    void pay() {
        System.out.println("Payment is done through UPI");
    }
}

// Derived class: Net Banking
class NETB extends Payment {
    void pay() {
        System.out.println("Payment is done through Net Banking");
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        Payment p2 = new CreditC();
        Payment p3 = new UPI();
        Payment p4 = new NETB();

        // Demonstrating overriding
        p1.pay();  // Output: Payment is processing
        p2.pay();  // Output: Payment is done through Credit Card
        p3.pay();  // Output: Payment is done through UPI
        p4.pay();  // Output: Payment is done through Net Banking
    }
}
