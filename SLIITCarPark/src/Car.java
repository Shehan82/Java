public class Car extends Vehicle{
	int NoOfDoors;
	String Color;
	static int NoOfCars = 0;
	Car(){
		NoOfCars+=1;
		super.Type = "Car";
	}
	
	
	public void setIDPlate(String IDPlate) {
		super.IDPlate = IDPlate;
	}
	public void setBrand(String Brand) {
		super.Brand = Brand;
	}
	public void setTimeDate(String TimeDate) {
		super.DateTime = TimeDate;
	}
	public void setNoOfDoors(int NoOfDoors) {
		this.NoOfDoors = NoOfDoors;
	}
	public void setColor(String Color) {
		this.Color = Color;
	}
	public String toString() {
		return (super.toString() +
				"\nNo. of Doors		: " + NoOfDoors +
				"\nColor			: " + Color);
	}
}