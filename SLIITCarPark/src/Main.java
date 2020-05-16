public class Main {

	public static void main(String[] args) {
		SLIITCarParkManager CarManager = new SLIITCarParkManager();
		CarManager.vehicleEntered("car");
		CarManager.setInfo("AB-7896", "Toyota", "Black", 4);
		
		CarManager.vehicleEntered("car");
		CarManager.setInfo("KL-3456", "Shehan", "Silver", 4);
		
		CarManager.vehicleEntered("threeWheeler");
		CarManager.setInfo("ABC-9087", "Bajaj", false);
		
		CarManager.vehicleLeft("AB-7896");
		
		CarManager.vehicleEntered("van");
		CarManager.setInfo("UVX-9254", "Ford", 10);

		CarManager.vehicleEntered("car");
		CarManager.setInfo("UVX-92eirieiruweiu54", "Foerljeirjerd", 10);
		
		CarManager.printAll();
	}
}