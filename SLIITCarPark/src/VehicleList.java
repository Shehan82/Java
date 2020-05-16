
public class VehicleList {
	Car[] carList = new Car[20];
	Van[] vanList = new Van[20];
	ThreeWheeler[] threewheelerList = new ThreeWheeler[20];
	
	void addCar() {
		carList[Car.NoOfCars] = new Car();
	}
	void addVan() {
		vanList[Van.NoOfVans] = new Van();
	}
	void addThreeWheeler() {
		threewheelerList[ThreeWheeler.NoOfThreeWheelers] = new ThreeWheeler();
	}
	void deleteCar(int i) {
		for(int j=i; j<Car.NoOfCars-1; j++) {
			carList[i] = carList[i+1];
		}
		carList[Car.NoOfCars-1] = null;
		Car.NoOfCars-=1;
		Vehicle.NoOfVehicles-=1;
	}
	void deleteVan(int i) {
		for(int j=i; j<Van.NoOfVans-1; j++) {
			vanList[i] = vanList[i+1];
		}
		vanList[Van.NoOfVans-1] = null;
		Van.NoOfVans-=1;
		Vehicle.NoOfVehicles-=1;
	}
	void deleteThreeWheeler(int i) {
		for(int j=i; j<ThreeWheeler.NoOfThreeWheelers-1; j++) {
			threewheelerList[i] = threewheelerList[i+1];
		}
		threewheelerList[ThreeWheeler.NoOfThreeWheelers-1] = null;
		ThreeWheeler.NoOfThreeWheelers-=1;
		Vehicle.NoOfVehicles-=1;
	}
	int carSize() {
		return Car.NoOfCars;
	}
	int vanSize() {
		return Van.NoOfVans;
	}
	int threewheelerSize() {
		return ThreeWheeler.NoOfThreeWheelers;
	}
}
