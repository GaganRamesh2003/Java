class GoldShop {
    static String[] goldItems = {null, null, null, null, null, null, null, null};
    static int itemIndex;

    public static boolean createGoldItem(String item) {
        if (item == null) 
		{
            System.out.println("Item name cannot be null");
            return false;
        }
        
        // Check if item already exists
           for (String existingItem : goldItems) {
        if (item.equals(existingItem)) {
            System.out.println("Item '" + item + "' already exists. Cannot add duplicate items.");
            return false;
        }
    }	
        
        if (itemIndex >= goldItems.length) {
            System.out.println("Cannot add more items. Array is full.");
            return false;
        } else {
            goldItems[itemIndex] = item;
            itemIndex++;
			System.out.println(item+" is Added");
            return true;
        }
    }

    public static void updateGoldItem(String oldItem, String newItem) {
        boolean isItemUpdated = false;
        for (int index = 0; index < goldItems.length; index++) {
            if (goldItems[index] != null && goldItems[index].equals(oldItem)) {
                goldItems[index] = newItem;
                isItemUpdated = true;
            }
        }
        if (!isItemUpdated) {
            System.out.println("Entered old item name is not found");
        } else {
            System.out.println(oldItem + " is updated to " + newItem);
        }
    }

    public static void getGoldItems() {
        System.out.println("The available gold items are:");
        for (int i = 0; i < goldItems.length; i++) {
            if (goldItems[i] != null) {
                System.out.println(i + ") " + goldItems[i]);
            }
        }
    }
}
