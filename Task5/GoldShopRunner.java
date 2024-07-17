public class GoldShopRunner {
    public static void main(String[] jewel) {
        // Testing the GoldShop class
        
        // Adding 8 different gold items
        GoldShop.createGoldItem("Ring");
        GoldShop.createGoldItem("Necklace");
        GoldShop.createGoldItem("Bracelet");
        GoldShop.createGoldItem("Earrings");
        GoldShop.createGoldItem("Pendant");
        
        GoldShop.createGoldItem("Chain");
        GoldShop.createGoldItem("Bangle");
        
        // Display all gold items
        GoldShop.getGoldItems();
        
        // Try to add a duplicate item
        GoldShop.createGoldItem("Ring");
        
        // Update an item
        GoldShop.updateGoldItem("Ring", "Charm");
        
        // Display all gold items again
        GoldShop.getGoldItems();
    }
}
