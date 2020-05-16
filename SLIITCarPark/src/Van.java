public class Van extends Vehicle{
	static int NoOfVans = 0;
	int NoOfSeats;
	Van(){
		NoOfVans+=1;
		super.Type = "Van";
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
	public void setNoOfSeats(int NoOfSeats) {
		this.NoOfSeats = NoOfSeats;
	}
	public String toString() {
		return (super.toString() +
				"\nNo. of Seats		: " + NoOfSeats);
	}
}