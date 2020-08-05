
public class Mobile {

	String brand;
	boolean isSmartPhone;
	double price;
	int ram;

//	Mobile(){ } JvM will craete

	Mobile() { // Deafault / no arg
		System.out.println("calling constructor");
		brand = "Samsung";
		isSmartPhone = true;
		price = 5000.00;
		ram = 4;
		System.out.println("ending the constructor");
	}

	void makeCall(long phoneNumber) {

		System.out.println("making call : " + phoneNumber);
	}

	void charging(boolean ischarging) {
		System.out.println("is charging:" + ischarging);
	}

	void locked(boolean isLocked) {
		System.out.println("is locked :" + isLocked);
	}

	public static void main(String[] args) {

		System.out.println("start");
		Mobile nokia = new Mobile(); // constructor // def const
		System.out.println("brand: " + nokia.brand + "isSmartPhone :" + nokia.isSmartPhone + "price: " + nokia.price
				+ "ram :" + nokia.ram);

		nokia.brand = "nokia";
		nokia.isSmartPhone = false;
		System.out.println("brand: " + nokia.brand + "isSmartPhone :" + nokia.isSmartPhone + "price: " + nokia.price
				+ "ram :" + nokia.ram);

		System.out.println("end ");

	}
}
