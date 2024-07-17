public class Shampoo {
    String brandName;
    int qty;
    String type;
    double price;
    String mfgDate;
    String expDate;

    public void washCars() {
        System.out.println("Washing cars with " + brandName + " shampoo...");
        System.out.println("Quantity: " + qty + " units");
        System.out.println("Type: " + type);
        System.out.println("Price:" + price);
        System.out.println("Manufactured on: " + mfgDate);
        System.out.println("Expires on: " + expDate);
        System.out.println("Rinse thoroughly!");
    }
}
