import java.util.Date;

public class SLIITCarParkManager implements CarParkManager{
	VehicleList vehicleList = new VehicleList();
	Date dateTime = new Date();
	
	public boolean vehicleEntered(String vehicleType) {
		if(getNumEmptySlots()>0) {
			switch (vehicleType.toUpperCase()) {
			case "CAR":
				vehicleList.addCar();
				System.out.println("-Entering a Vehicle-");
				System.out.println(getNumEmptySlots()+ 1 +" parking slots are available for entered vehicle");
				return true;
			case "VAN":
				vehicleList.addVan();
				System.out.println("-Entering a Vehicle-");
				System.out.println(getNumEmptySlots()+ 1 +" parking slots are available for entered vehicle ");
				return true;
			case "THREEWHEELER":
				vehicleList.addThreeWheeler();
				System.out.println("-Entering a Vehicle-");
				System.out.println(getNumEmptySlots()+ 1 +" parking slots are available for entered vehicle");
				return true;
			default:
				System.out.println("Invalid input type.....");
				return false;
			}
		} else {
			System.out.println("There are No parking slots available for entered vehicle! \n");
			return false;
		}
	}
	public void setInfo(String IDPlate, String Brand, String Color, int NoOfDoors) {
		try {
			vehicleList.carList[vehicleList.carSize()-1].setIDPlate(IDPlate);
			vehicleList.carList[vehicleList.carSize()-1].setBrand(Brand);
			vehicleList.carList[vehicleList.carSize()-1].setColor(Color);
			vehicleList.carList[vehicleList.carSize()-1].setNoOfDoors(NoOfDoors);
			vehicleList.carList[vehicleList.carSize()-1].setTimeDate(dateTime.toString());
			System.out.println(vehicleList.carList[vehicleList.carSize()-1].toString());
			System.out.println("\n");
		}catch(ArrayIndexOutOfBoundsException e) {}
	}
	public void setInfo(String IDPlate, String Brand, int NoOfSeats) {
		try {
			vehicleList.vanList[vehicleList.vanSize()-1].setIDPlate(IDPlate);
			vehicleList.vanList[vehicleList.vanSize()-1].setBrand(Brand);
			vehicleList.vanList[vehicleList.vanSize()-1].setNoOfSeats(NoOfSeats);
			vehicleList.vanList[vehicleList.vanSize()-1].setTimeDate(dateTime.toString());
			System.out.println(vehicleList.vanList[vehicleList.vanSize()-1].toString());
			System.out.println("\n");
		}catch(ArrayIndexOutOfBoundsException e) {}
	}
	public void setInfo(String IDPlate, String Brand, boolean isTaxi) {
		try {
			vehicleList.threewheelerList[vehicleList.threewheelerSize()-1].setIDPlate(IDPlate);
			vehicleList.threewheelerList[vehicleList.threewheelerSize()-1].setBrand(Brand);
			vehicleList.threewheelerList[vehicleList.threewheelerSize()-1].isTaxi(isTaxi);
			vehicleList.threewheelerList[vehicleList.threewheelerSize()-1].setTimeDate(dateTime.toString());
			System.out.println(vehicleList.threewheelerList[vehicleList.threewheelerSize()-1].toString());
			System.out.println("\n");
		}catch(ArrayIndexOutOfBoundsException e) {}
	}
	public int vehicleLeft(String IDPlate) {
		for(int i=0; i<vehicleList.carSize(); i++) {
			if(vehicleList.carList[i].IDPlate == IDPlate) {
				System.out.println("-Vehicle Leaving-");
				System.out.println(vehicleList.carList[i].toString());
				vehicleList.deleteCar(i);
				System.out.println("Number of Free Slots	: "+getNumEmptySlots());
				System.out.println("\n");
				return getNumEmptySlots();
			}
		}
		for(int i=0; i<vehicleList.vanSize(); i++) {
			if(vehicleList.vanList[i].IDPlate == IDPlate) {
				System.out.println("-Vehicle Leaving-");
				System.out.println(vehicleList.vanList[i].toString());
				vehicleList.deleteVan(i);
				System.out.println("Free Slots : "+getNumEmptySlots());
				System.out.println("\n");
				return getNumEmptySlots();
			}
		}
		for(int i=0; i<vehicleList.threewheelerSize(); i++) {
			if(vehicleList.threewheelerList[i].IDPlate == IDPlate) {
				System.out.println("-Vehicle Leaving-");
				System.out.println(vehicleList.threewheelerList[i].toString());
				vehicleList.deleteThreeWheeler(i);
				System.out.println("Free Slots : "+getNumEmptySlots());
				System.out.println("\n");
				return getNumEmptySlots();
			}
		}
		System.out.println("Invalid ID, please check and re-enter");
		return getNumEmptySlots();
	}		
	public int getNumEmptySlots() {
		return 20-Vehicle.NoOfVehicles;
	}
	public int getNumOccupiedSlots() {
		return Vehicle.NoOfVehicles;
	}
	public void printAll() {
		System.out.println("                -Vehicle List-");
		System.out.println("-------------------------------------------------------");
		for(int i=0; i<vehicleList.carSize(); i++) {
			System.out.println(vehicleList.carList[i].toString());
			System.out.println("-------------------------------------------------------");
		}
		for(int i=0; i<vehicleList.vanSize(); i++) {
			System.out.println(vehicleList.vanList[i].toString());
			System.out.println("-------------------------------------------------------");
		}
		for(int i=0; i<vehicleList.threewheelerSize(); i++) {
			System.out.println(vehicleList.threewheelerList[i].toString());
			System.out.println("-------------------------------------------------------");
		}
	}
}
