class Girias {
    static String[] homeAppliances = {null, null, null, null, null, null, null, null, null, null, null, null};
    static int homeindex;

    public static boolean createHomeAppliance(String appliance) {
        if (appliance == null) {
            System.out.println("Appliance name cannot be null");
            return false;
        }
        if (homeindex >= homeAppliances.length) {
            System.out.println("Cannot add more home appliances. Array is full.");
            return false;
        } else {
            homeAppliances[homeindex] = appliance;
            homeindex++;
            return true;
        }
    }
					public static void updateHomeAppliance(String oldhomeAppliance,String newhomeAppliance)
					{
						boolean ishomeApplianceUpdated=false;
						for(int index=0;index<homeAppliances.length;index++)
						{
							if(homeAppliances[index]==oldhomeAppliance)
							{
								homeAppliances[index]=newhomeAppliance;
								ishomeApplianceUpdated=true;
							}
						}
						if(ishomeApplianceUpdated==false)
						{
							System.out.println("Entered Oldname is not found");
						}
						else{
							System.out.println(oldhomeAppliance+" is updated to "+newhomeAppliance);
						}
					}
    public static void getHomeAppliances() {
        System.out.println("The available home appliances are:");
        for (int i = 0; i < homeAppliances.length; i++) {
			 if (homeAppliances[i] != null)
            System.out.println(i + ") " + homeAppliances[i]);
        }
    }
}
