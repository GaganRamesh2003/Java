import java.util.Arrays;
class Gym {
    static String[] gymEquipments = {null, null, null, null, null, null, null, null};
    static int Equpmentindex;

    public static boolean createGymEquipment(String equipment) 
	{
        if (equipment == null)
			{
            System.out.println("Equipment name cannot be null");
            return false;
        }
		for(String ExistingItem:gymEquipments)
		{
			if(equipment.equals(ExistingItem))
			{
				System.out.println("Same Item cant be Added");
				return false;
			}
		}
        if (Equpmentindex >= gymEquipments.length)
			{
            System.out.println("Cannot add more gym equipments. Array is full.");
            return false;
        } else {
            gymEquipments[Equpmentindex] = equipment;
            Equpmentindex++;
			return true;
        }
    }
					public static void updateGymEquipment(String oldGymEquipment,String newGymEquipment)
					{
						boolean isGymEquipmentUpdated=false;
						for(int index=0;index<gymEquipments.length;index++)
						{
							if(gymEquipments[index]==oldGymEquipment)
							{
								gymEquipments[index]=newGymEquipment;
								isGymEquipmentUpdated=true;
							}
						}
						if(isGymEquipmentUpdated==false)
						{
							System.out.println("Entered Oldname is not found");
						}
						else{
							System.out.println(oldGymEquipment+" is updated to "+newGymEquipment);
						}
					}
    public static void getGymEquipments() 
	{
        System.out.println("The available gym equipments are:");
        for (int i = 0; i < gymEquipments.length; i++) 
		{
			 if (gymEquipments[i] != null)
			 {
            System.out.println(i + ") " + gymEquipments[i]);
			 }
        }
    }
	public static boolean deleteGymEquipment(String GymEquipmentTobeDeleted) {
    boolean isGymEquipmentDeleted = false;
    int newSize = 0;

    for (int oldIndex = 0; oldIndex < gymEquipments.length; oldIndex++) {
        if (!gymEquipments[oldIndex].equals(GymEquipmentTobeDeleted)) {
            gymEquipments[newSize] = gymEquipments[oldIndex];
            newSize++;
        } else {
            isGymEquipmentDeleted = true;
        }
    }

    gymEquipments = Arrays.copyOf(gymEquipments, newSize);

    if (!isGymEquipmentDeleted) {
        System.out.println(GymEquipmentTobeDeleted + " not found");
    }

    return isGymEquipmentDeleted;
}

}
