public class SimCard {
     String operator;
     String plan;
     String phoneNumber;
     double balance;

    public SimCard(String operator, String plan, String phoneNumber, double balance) {
        this.operator = operator;
        this.plan = plan;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " using " + operator + " sim with plan: " + plan + ".");
    }

    public void recharge(double amount) {
        balance += amount;
        System.out.println("Recharged " + amount + ". New balance: " + balance);
    }

    public void checkBalance() {
        System.out.println("Current balance for " + phoneNumber + ": " + balance);
    }
}
