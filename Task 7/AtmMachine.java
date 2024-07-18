public class AtmMachine {
     String location;
     String bankName;
     int atmId;
     double balance;

    public AtmMachine(String location, String bankName, int atmId, double balance) {
        this.location = location;
        this.bankName = bankName;
        this.atmId = atmId;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in ATM " + atmId + " at " + location);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful from ATM " + atmId + " at " + location);
            System.out.println("Remaining balance in ATM " + atmId + ":" + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful to ATM " + atmId + " at " + location);
        System.out.println("Updated balance in ATM " + atmId + ": $" + balance);
    }

    public void displayDetails() {
        System.out.println("ATM Details:");
        System.out.println("Location: " + location);
        System.out.println("Bank Name: " + bankName);
        System.out.println("ATM ID: " + atmId);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }
}
