class Bar {
    static String[] beverages = new String[15];
    static int beverageIndex;

    public static boolean createBeverage(String beverage) {
        if (beverage == null) {
            System.out.println("Beverage name cannot be null");
            return false;
        }
        
        // Check if beverage already exists
        for (String existingBeverage : beverages) {
            if (beverage.equals(existingBeverage)) {
                System.out.println("Beverage '" + beverage + "' already exists. Cannot add duplicate beverages.");
                return false;
            }
        }
        
        // If beverage does not exist, add it
        if (beverageIndex >= beverages.length) {
            System.out.println("Cannot add more beverages. Array is full.");
            return false;
        } else {
            beverages[beverageIndex] = beverage;
            beverageIndex++;
            return true;
        }
    }

    public static void updateBeverage(String oldBeverage, String newBeverage) {
        boolean isBeverageUpdated = false;
        for (int index = 0; index < beverages.length; index++) {
            if (beverages[index] != null && beverages[index].equals(oldBeverage)) {
                beverages[index] = newBeverage;
                isBeverageUpdated = true;
            }
        }
        if (!isBeverageUpdated) {
            System.out.println("Entered old beverage name is not found");
        } else {
            System.out.println(oldBeverage + " is updated to " + newBeverage);
        }
    }

    public static void getBeverages() {
        System.out.println("The available beverages are:");
        for (int i = 0; i < beverages.length; i++) {
            if (beverages[i] != null) {
                System.out.println(i + ") " + beverages[i]);
            }
        }
    }


}
