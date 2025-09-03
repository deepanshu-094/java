// Custom Exception: Insufficient Funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

// Custom Exception: Invalid Amount
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

public class InsufficientFunds {
    private String acc_name;
    private double bal;

    // Constructor
    public InsufficientFunds(String name, double openbal) throws InvalidAmountException {
        if (openbal < 0) {
            throw new InvalidAmountException("Opening balance can't be negative");
        }
        this.acc_name = name;
        this.bal = openbal;
    }

    // Withdraw
    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt <= 0) {
            throw new InsufficientFundsException("Withdraw amount must be positive");
        }
        if (amt > bal) {
            throw new InsufficientFundsException("Insufficient funds! Short by: " + (amt - bal));
        }
        bal = bal - amt;
        System.out.println("Withdrawn: " + amt + " | Remaining Balance: " + bal);
    }

    // Deposit
    public void deposit(double amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        bal = bal + amt;
        System.out.println("Deposited: " + amt + " | New Balance: " + bal);
    }

    // Getter
    public double getBal() {
        return bal;
    }

    // Main method
    public static void main(String[] args) {
        try {
            InsufficientFunds rahul = new InsufficientFunds("Rahul", 1000.45);

            try {
                rahul.withdraw(2000.45); // ❌ will throw exception
            } catch (InsufficientFundsException e) {
                System.out.println("Withdraw error: " + e.getMessage());
            } finally {
                System.out.println("Your Session expired");
            }

            try {
                rahul.deposit(-200); // ❌ will throw exception
            } catch (InvalidAmountException e) {
                System.out.println("Deposit error: " + e.getMessage());
            }

            System.out.println("Final Balance of " + rahul.acc_name + " = " + rahul.getBal());

        } catch (InvalidAmountException e) {
            System.out.println("Account creation failed: " + e.getMessage());
        }
    }
}
