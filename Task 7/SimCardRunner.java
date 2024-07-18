class SimCardRunner {
    public static void main(String[] connect) {
        SimCard sim1 = new SimCard("Airtel", "Prepaid", "9876543210", 250.50);
        sim1.makeCall("1234567890");
        sim1.recharge(100);
        sim1.checkBalance();

        SimCard sim2 = new SimCard("Jio", "Postpaid", "8765432109", 75.25);
        sim2.makeCall("9876543210");
        sim2.recharge(200);
        sim2.checkBalance();

        SimCard sim3 = new SimCard("Vodafone", "Prepaid", "7654321098", 150.00);
        sim3.makeCall("8765432109");
        sim3.recharge(50);
        sim3.checkBalance();

        SimCard sim4 = new SimCard("BSNL", "Prepaid", "6543210987", 300.75);
        sim4.makeCall("7654321098");
        sim4.recharge(150);
        sim4.checkBalance();

        SimCard sim5 = new SimCard("Idea", "Postpaid", "5432109876", 200.00);
        sim5.makeCall("6543210987");
        sim5.recharge(75);
        sim5.checkBalance();

        SimCard sim6 = new SimCard("Aircel", "Prepaid", "4321098765", 180.50);
        sim6.makeCall("5432109876");
        sim6.recharge(120);
        sim6.checkBalance();

        SimCard sim7 = new SimCard("Tata Docomo", "Prepaid", "3210987654", 220.75);
        sim7.makeCall("4321098765");
        sim7.recharge(80);
        sim7.checkBalance();

        SimCard sim8 = new SimCard("Reliance", "Postpaid", "2109876543", 190.25);
        sim8.makeCall("3210987654");
        sim8.recharge(100);
        sim8.checkBalance();

        SimCard sim9 = new SimCard("MTNL", "Prepaid", "1098765432", 270.00);
        sim9.makeCall("2109876543");
        sim9.recharge(150);
        sim9.checkBalance();

        SimCard sim10 = new SimCard("Telenor", "Prepaid", "0987654321", 300.50);
        sim10.makeCall("1098765432");
        sim10.recharge(200);
        sim10.checkBalance();

        SimCard sim11 = new SimCard("Videocon", "Prepaid", "9876543210", 260.75);
        sim11.makeCall("0987654321");
        sim11.recharge(120);
        sim11.checkBalance();

        SimCard sim12 = new SimCard("Uninor", "Prepaid", "8765432109", 180.00);
        sim12.makeCall("9876543210");
        sim12.recharge(80);
        sim12.checkBalance();

        SimCard sim13 = new SimCard("Loop Mobile", "Prepaid", "7654321098", 150.25);
        sim13.makeCall("8765432109");
        sim13.recharge(50);
        sim13.checkBalance();

        SimCard sim14 = new SimCard("Spice Telecom", "Prepaid", "6543210987", 200.50);
        sim14.makeCall("7654321098");
        sim14.recharge(100);
        sim14.checkBalance();

        SimCard sim15 = new SimCard("Etisalat", "Postpaid", "5432109876", 220.00);
        sim15.makeCall("6543210987");
        sim15.recharge(150);
        sim15.checkBalance();
    }
}
