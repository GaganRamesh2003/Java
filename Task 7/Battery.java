public class Battery {
    private String brand;
    private int capacity; // in mAh (milliampere-hour)
    private double voltage; // in volts
    private double price; // in Indian Rupees

    public Battery(String brand, int capacity, double voltage, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.voltage = voltage;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Battery Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " mAh");
        System.out.println("Voltage: " + voltage + " V");
        System.out.println("Price: " + price);
        System.out.println();
    }
}
