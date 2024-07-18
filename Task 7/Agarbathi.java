public class Agarbathi {
     String brand;
     String fragrance;
     double lengthInInches;
     int sticksPerBox;
     double price;

    public Agarbathi(String brand, String fragrance, double lengthInInches, int sticksPerBox, double price) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.lengthInInches = lengthInInches;
        this.sticksPerBox = sticksPerBox;
        this.price = price;
    }

    public void light() {
        System.out.println("Lighting " + brand + " agarbathi with " + fragrance + " fragrance.");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Length: " + lengthInInches + " inches");
        System.out.println("Sticks per box: " + sticksPerBox);
        System.out.println("Price: $" + price);
    }
}
