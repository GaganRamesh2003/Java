class Shampoo {
     String brand;
     String type;
     int volumeInMl;
     double price;

    public Shampoo(String brand, String type, int volumeInMl, double price) {
        this.brand = brand;
        this.type = type;
        this.volumeInMl = volumeInMl;
        this.price = price;
    }

    public void use() {
        System.out.println("Using " + brand + " " + type + " shampoo (" + volumeInMl + "ml).");
    }
}
