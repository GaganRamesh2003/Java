class AmusementPark {
    private String name;
    private String place;
    private int noOfGames;

    public AmusementPark(String name, String place, int noOfGames) {
        this.name = name;
        this.place = place;
        this.noOfGames = noOfGames;
    }

    public void play() {
        System.out.println("Welcome to " + name + " located in " + place + ".");
        System.out.println("Number of games available: " + noOfGames);
        System.out.println("Enjoy your time at " + name + "!");
        System.out.println("------------------------------------------------------");
    }
}
