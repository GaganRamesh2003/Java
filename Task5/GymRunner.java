public class GymRunner {
    public static void main(String[] fitness) 
	{
        Gym.createGymEquipment("Kettlebells");
        Gym.createGymEquipment("Treadmill");
        Gym.createGymEquipment("Rowing Machine");
        Gym.createGymEquipment("Dumbbells");
        Gym.createGymEquipment("Exercise Bike");
        Gym.createGymEquipment("Pull-up Bar");
        Gym.createGymEquipment("Bench Press");
        Gym.createGymEquipment("Resistance Bands");
		Gym.createGymEquipment("Exercise Bike");
		Gym.getGymEquipments();
		Gym.updateGymEquipment("Pull-up Bar","Cycling");
        Gym.getGymEquipments();
		Gym.deleteGymEquipment("Treadmill");
		 Gym.getGymEquipments();
    }
}
