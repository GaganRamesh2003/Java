class AtmMachineRunner {
    public static void main(String[] money) {
        AtmMachine atm1 = new AtmMachine("Mumbai", "State Bank of India", 1001, 100000.00);
        atm1.displayDetails();
        atm1.withdraw(5000);
        atm1.deposit(20000);
        atm1.displayDetails();

        AtmMachine atm2 = new AtmMachine("Delhi", "ICICI Bank", 1002, 80000.00);
        atm2.displayDetails();
        atm2.withdraw(10000);
        atm2.deposit(15000);
        atm2.displayDetails();

        AtmMachine atm3 = new AtmMachine("Bangalore", "HDFC Bank", 1003, 120000.00);
        atm3.displayDetails();
        atm3.withdraw(8000);
        atm3.deposit(30000);
        atm3.displayDetails();

        AtmMachine atm4 = new AtmMachine("Chennai", "Axis Bank", 1004, 90000.00);
        atm4.displayDetails();
        atm4.withdraw(7000);
        atm4.deposit(25000);
        atm4.displayDetails();

        AtmMachine atm5 = new AtmMachine("Kolkata", "Punjab National Bank", 1005, 110000.00);
        atm5.displayDetails();
        atm5.withdraw(6000);
        atm5.deposit(18000);
        atm5.displayDetails();

        AtmMachine atm6 = new AtmMachine("Hyderabad", "Bank of Baroda", 1006, 95000.00);
        atm6.displayDetails();
        atm6.withdraw(12000);
        atm6.deposit(35000);
        atm6.displayDetails();

        AtmMachine atm7 = new AtmMachine("Ahmedabad", "Canara Bank", 1007, 85000.00);
        atm7.displayDetails();
        atm7.withdraw(9000);
        atm7.deposit(22000);
        atm7.displayDetails();

        AtmMachine atm8 = new AtmMachine("Pune", "Union Bank of India", 1008, 105000.00);
        atm8.displayDetails();
        atm8.withdraw(10000);
        atm8.deposit(28000);
        atm8.displayDetails();

        AtmMachine atm9 = new AtmMachine("Jaipur", "Indian Bank", 1009, 75000.00);
        atm9.displayDetails();
        atm9.withdraw(5000);
        atm9.deposit(15000);
        atm9.displayDetails();

        AtmMachine atm10 = new AtmMachine("Lucknow", "IDBI Bank", 1010, 100000.00);
        atm10.displayDetails();
        atm10.withdraw(6000);
        atm10.deposit(20000);
        atm10.displayDetails();

        AtmMachine atm11 = new AtmMachine("Chandigarh", "Bank of India", 1011, 90000.00);
        atm11.displayDetails();
        atm11.withdraw(7000);
        atm11.deposit(25000);
        atm11.displayDetails();

        AtmMachine atm12 = new AtmMachine("Noida", "Central Bank of India", 1012, 110000.00);
        atm12.displayDetails();
        atm12.withdraw(8000);
        atm12.deposit(30000);
        atm12.displayDetails();

        AtmMachine atm13 = new AtmMachine("Gurgaon", "UCO Bank", 1013, 95000.00);
        atm13.displayDetails();
        atm13.withdraw(12000);
        atm13.deposit(35000);
        atm13.displayDetails();

        AtmMachine atm14 = new AtmMachine("Coimbatore", "Bank of Maharashtra", 1014, 85000.00);
        atm14.displayDetails();
        atm14.withdraw(9000);
        atm14.deposit(22000);
        atm14.displayDetails();

        AtmMachine atm15 = new AtmMachine("Visakhapatnam", "Andhra Bank", 1015, 105000.00);
        atm15.displayDetails();
        atm15.withdraw(10000);
        atm15.deposit(28000);
        atm15.displayDetails();
    }
}
