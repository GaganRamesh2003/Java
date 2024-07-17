   class BarRunner
   {
   public static void main(String[] liquor) {
        
        // Adding 15 different beverages
        Bar.createBeverage("Beer");
        Bar.createBeverage("Wine");
        Bar.createBeverage("Whiskey");
        Bar.createBeverage("Vodka");
        Bar.createBeverage("Rum");
        Bar.createBeverage("Tequila");
        Bar.createBeverage("Gin");
        Bar.createBeverage("Brandy");
       Bar.createBeverage("Champagne");
        Bar.createBeverage("Cider");
        Bar.createBeverage("Sake");
        Bar.createBeverage("Absinthe");
        Bar.createBeverage("Kahlua");
        Bar.createBeverage("Mojito");
        Bar.createBeverage("Martini");

        // Display all beverages
        Bar.getBeverages();

        // Try to add a duplicate beverage
        Bar.createBeverage("Beer");

        // Update a beverage
        Bar.updateBeverage("Beer", "Craft Beer");

        // Display all beverages again
        Bar.getBeverages();
    }
	}