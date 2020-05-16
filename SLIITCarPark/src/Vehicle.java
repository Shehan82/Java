
public abstract class Vehicle {	
	String IDPlate;
	String Type;
	String Brand;
	String DateTime;
	static int NoOfVehicles=0;
	
	Vehicle(){
		NoOfVehicles+=1;
	}
	
	abstract void setIDPlate(String IDPlate);
	abstract void setBrand(String Brand);
	abstract void setTimeDate(String TimeDate);
	public String toString() {
		return ("ID Plate		: " + IDPlate + 
				"\nType			: " + Type +
				"\nBrand			: " + Brand +
				"\nEntered Time		: " + DateTime);
	}
}