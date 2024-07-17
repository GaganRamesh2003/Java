public class RedChilliesEntertainmentRunner {
    public static void main(String[] args) {
        RedChilliesEntertainment.addMovieActors("Puneeth Rajkumar");
        RedChilliesEntertainment.addMovieActors("Sudeep");
        RedChilliesEntertainment.addMovieActors("Yash");
        RedChilliesEntertainment.addMovieActors("Radhika");
        RedChilliesEntertainment.addMovieActors("Sri Muruli");
        RedChilliesEntertainment.addMovieActors("Deepika Padukone");
        RedChilliesEntertainment.addMovieActors("Yogi");
        RedChilliesEntertainment.addMovieActors("Alia Bhatt");
        RedChilliesEntertainment.addMovieActors("Rachitha Ram");
		        RedChilliesEntertainment.getMovieActors();

		RedChilliesEntertainment.updateMovieActor("Yogi","Duniya Vijay");
        RedChilliesEntertainment.getMovieActors();
    }
}
