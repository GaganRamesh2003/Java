   class WatchShopRunner{
   public static void main(String[] time) {
        
        // Adding 10 different watches
        WatchShop.createWatch("Omega");
        WatchShop.createWatch("Tag Heuer");
        WatchShop.createWatch("Seiko");
        WatchShop.createWatch("Casio");
        WatchShop.createWatch("Swatch");
        WatchShop.createWatch("Rolex");
        WatchShop.createWatch("Timex");
        WatchShop.createWatch("Fossil");
        WatchShop.createWatch("Tissot");
        WatchShop.createWatch("Citizen");

        // Display all watches
        WatchShop.getWatches();

        // Try to add a duplicate watch
        WatchShop.createWatch("Rolex");

        // Update a watch
        WatchShop.updateWatch("Rolex", "Patek Philippe");

        // Display all watches again
        WatchShop.getWatches();
    }
	}