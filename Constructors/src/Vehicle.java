
public class Vehicle {

	String regNo;
	int noOfWheels;
	String fuelType;

	public Vehicle() {
		System.out.println("no arg");
	}

	public Vehicle(String inRegNo, int inNoOfwheels, String inFuelType) {
		regNo = inRegNo;
		noOfWheels = inNoOfwheels;
		fuelType = inFuelType;
	}

	public Vehicle(String inRegNo) {
		regNo = inRegNo;
	}
	public Vehicle(String inRegNo , int inNoOfWheels) {
		regNo= inRegNo;
		noOfWheels = inNoOfWheels;
		
		}
	

	void running() {
		System.out.println("running");
	}

	void applyBreaks(boolean breaks) {
		System.out.println("applying break:" + breaks);
	}

	public static void main(String[] args) {

		System.out.println("start of program");

		Vehicle car = new Vehicle();

		System.out.println("regNo:" + car.regNo + " No of wheels: " + car.noOfWheels + " fuelType: " + car.fuelType);

		Vehicle bike = new Vehicle("KA05ME1752", 2, "petrol");

		System.out.println("regNo:" + bike.regNo + "no of wheels:" + bike.noOfWheels + "fuel type:" + bike.fuelType);

		Vehicle truck = new Vehicle("KA02AH004");

		System.out.println("regNo:" + truck.regNo + "no of wheels:" + truck.noOfWheels + "fuel type:" + truck.fuelType);

		System.out.println("end of prog");
	}

}
