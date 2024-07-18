class SunGlasses {
     String brand;
     String model;
     String frameColor;
     String lensColor;
     double price;

    public SunGlasses(String brand, String model, String frameColor, String lensColor, double price) {
        this.brand = brand;
        this.model = model;
        this.frameColor = frameColor;
        this.lensColor = lensColor;
        this.price = price;
    }

    public void wear() {
        System.out.println("Wearing " + brand + " " + model + " sunglasses with " + frameColor + " frame and " + lensColor + " lenses.");
    }

    public void showPrice() {
        System.out.println("Price: $" + price);
    }
}
