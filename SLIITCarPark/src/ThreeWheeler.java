public class ThreeWheeler extends Vehicle{
	Boolean isTaxi;
	static int NoOfThreeWheelers = 0;
	ThreeWheeler(){
		NoOfThreeWheelers+=1;
		super.Type = "ThreeWheeler";
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
	public void isTaxi(boolean isTaxi) {
		this.isTaxi = isTaxi;
	}
	public String toString() {
		return (super.toString() +
				"\nIs Taxi			: " + isTaxi);
	}
}