
public class Bag {
	
	String brand;
	int pouch;
	String Type;
	
	
	public Bag() {
		System.out.println("no arg");
	}

	public Bag(String inbrand, int inpouch, String inType) {
		brand = inbrand;
		pouch = inpouch;
        Type = inType;
	}
	public Bag(String inbrand) {
		brand = inbrand;
	}
	
	public Bag(String inbrand , int inpouch) {
		brand= inbrand;
		pouch = inpouch;
		
		}
	
	
	public static void main(String[] args) {
		
		Bag office = new Bag();
		
		System.out.println("brand:" + office.brand + " pouch: " + office.pouch + " Type: " + office.Type);
		
		Bag gym = new Bag("Nike", 2, "backpack");
		System.out.println("brand:" + gym.brand    + "pouch:" + gym.pouch + " type:" + gym.Type);

	}

}
