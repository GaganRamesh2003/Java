class Liberty {
    static String[] shoeBrands = new String[15];
    static int brandIndex;

    public static boolean addShoeBrand(String brand) {
        if (brand == null) {
            System.out.println("Brand name cannot be null");
            return false;
        }
        
        // Check if brand already exists
        for (String existingBrand : shoeBrands) {
            if (brand.equals(existingBrand)) {
                System.out.println("Brand '" + brand + "' already exists. Cannot add duplicate brands.");
                return false;
            }
        }
        
        // If brand does not exist, add it
        if (brandIndex >= shoeBrands.length) {
            System.out.println("Cannot add more brands. Array is full.");
            return false;
        } else {
            shoeBrands[brandIndex] = brand;
            brandIndex++;
            return true;
        }
    }

    public static void updateShoeBrand(String oldBrand, String newBrand) {
        boolean isBrandUpdated = false;
        for (int index = 0; index < shoeBrands.length; index++) {
            if (shoeBrands[index] != null && shoeBrands[index].equals(oldBrand)) {
                shoeBrands[index] = newBrand;
                isBrandUpdated = true;
            }
        }
        if (!isBrandUpdated) {
            System.out.println("Entered old brand name is not found");
        } else {
            System.out.println(oldBrand + " is updated to " + newBrand);
        }
    }

    public static void getShoeBrands() {
        System.out.println("The available shoe brands are:");
        for (int i = 0; i < shoeBrands.length; i++) {
            if (shoeBrands[i] != null) {
                System.out.println(i + ") " + shoeBrands[i]);
            }
        }
    }

    public static void main(String[] footWears) {
        
        
        // Adding shoe brands
        addShoeBrand("Nike");
        addShoeBrand("Adidas");
        addShoeBrand("Puma");
        addShoeBrand("Reebok");
        addShoeBrand("New Balance");
        addShoeBrand("Under Armour");
        addShoeBrand("Skechers");
        addShoeBrand("ASICS");
        addShoeBrand("Vans");
        addShoeBrand("Converse");

        // Display all shoe brands
        getShoeBrands();

        // Try to add a duplicate brand
        addShoeBrand("Nike");

        // Update a brand
        updateShoeBrand("Nike", "Jordan");

        // Display all shoe brands again
        getShoeBrands();
    }
}
