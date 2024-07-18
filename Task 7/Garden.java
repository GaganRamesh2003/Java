class Garden {
     String name;
     String location;
     int areaInSquareMeters;
     String typeOfPlants;

    public Garden(String name, String location, int areaInSquareMeters, String typeOfPlants) {
        this.name = name;
        this.location = location;
        this.areaInSquareMeters = areaInSquareMeters;
        this.typeOfPlants = typeOfPlants;
    }

    public void visit() {
        System.out.println("Welcome to " + name + " in " + location + ".");
        System.out.println("Area: " + areaInSquareMeters + " square meters");
        System.out.println("Type of plants: " + typeOfPlants);
        System.out.println("Enjoy your visit to " + name + "!");
        System.out.println("------------------------------------------------------");
    }
}
