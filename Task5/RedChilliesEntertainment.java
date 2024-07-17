 class RedChilliesEntertainment {
    static String[] movieActors = {null, null, null, null, null, null, null, null, null};
    static int actorindex;

    public static boolean addMovieActors(String actor) {
        if (actor == null) {
            System.out.println("Actor name cannot be null");
            return false;
        }
        if (actorindex >= movieActors.length) {
            System.out.println("Cannot add more movie actors. Array is full.");
            return false;
        } else {
            movieActors[actorindex] = actor;
            actorindex++;
            return true;
        }
    }
					public static void updateMovieActor(String oldmovieActor,String newmovieActor)
					{
						boolean ismovieActorUpdated=false;
						for(int index=0;index<movieActors.length;index++)
						{
							if(movieActors[index]==oldmovieActor)
							{
								movieActors[index]=newmovieActor;
								ismovieActorUpdated=true;
							}
						}
						if(ismovieActorUpdated==false)
						{
							System.out.println("Entered Oldname is not found");
						}
						else{
							System.out.println(oldmovieActor+" is updated to "+newmovieActor);
						}
					}
    public static void getMovieActors() {
        System.out.println("The available movie actors are:");
        for (int i = 0; i < movieActors.length; i++) {
			 if (movieActors[i] != null)
            System.out.println(i + ") " + movieActors[i]);
        }
    }
}
