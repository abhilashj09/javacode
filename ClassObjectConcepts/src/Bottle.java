
public class Bottle {

//	instance variable
	String color;
	String material;
	int liters;

	Bottle() {   //constructor

	System.out.println("creating bottle object");
	System.out.println();
	}
	void pour() {
		System.out.println("pouring water");

	}

	void opencap() {
		System.out.println("cap");
	}

	void closecap() {
		System.out.println("closecap");
	}

	public static void main(String[] args) {

		Bottle obj = new Bottle();
		obj.color = "grey";
		obj.material = "steel";
		obj.liters = 1;

		System.out.println("color :" + obj.color);

		System.out.println("material :" + obj.material);
		System.out.println("liters :" + obj.liters);

		obj.pour();
		obj.opencap();
		obj.closecap();

	}

}
