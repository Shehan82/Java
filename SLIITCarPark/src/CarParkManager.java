public interface CarParkManager {
	final int totalVehicleSlots = 20;
	boolean vehicleEntered(String vehicleType);
	int vehicleLeft(String IDPlate);
	int getNumEmptySlots();
	int getNumOccupiedSlots();
}