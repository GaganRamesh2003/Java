class WatchShop {
    static String[] watches = {null, null, null, null, null, null, null, null, null, null};
    static int watchIndex;

    public static boolean createWatch(String watch) {
        if (watch == null) {
            System.out.println("Watch name cannot be null");
            return false;
        }
        
        // Check if watch already exists
        for (String existingWatch : watches) {
            if (watch.equals(existingWatch)) {
                System.out.println("Watch '" + watch + "' already exists. Cannot add duplicate watches.");
                return false;
            }
        }
        
        // If watch does not exist, add it
        if (watchIndex >= watches.length) {
            System.out.println("Cannot add more watches. Array is full.");
            return false;
        } else {
            watches[watchIndex] = watch;
            watchIndex++;
            return true;
        }
    }

    public static void updateWatch(String oldWatch, String newWatch) {
        boolean isWatchUpdated = false;
        for (int index = 0; index < watches.length; index++) {
            if (watches[index] != null && watches[index].equals(oldWatch)) {
                watches[index] = newWatch;
                isWatchUpdated = true;
            }
        }
        if (!isWatchUpdated) {
            System.out.println("Entered old watch name is not found");
        } else {
            System.out.println(oldWatch + " is updated to " + newWatch);
        }
    }

    public static void getWatches() {
        System.out.println("The available watches are:");
        for (int i = 0; i < watches.length; i++) {
            if (watches[i] != null) {
                System.out.println(i + ") " + watches[i]);
            }
        }
    }


}
