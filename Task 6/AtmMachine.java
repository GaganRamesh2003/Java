class AtmMachine {
    int id;
    String location;
    String bankName;

    public void thisMachine() {
        System.out.println("Welcome to ATM Machine " + id + " located at " + location + ".");
        System.out.println("Bank: " + bankName);
        System.out.println("Insert your card and proceed with your transaction.");
    }
}
