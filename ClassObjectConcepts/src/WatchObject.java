
public class WatchObject 
{
	String color; 
	String material;
	int minutes;

	
	void stopwatch() {
		System.out.println("Stopwatch is running");

	}

	void light() {
		System.out.println("light is on");
	}

	void alarm() {
		System.out.println("watch is buzzing");
	}

	public static void main(String[] args) {

		WatchObject titan = new WatchObject();
		titan.color = "grey";
		titan.material = "Leather";
		titan.minutes = 10;

		System.out.println("color :" + titan.color);

		System.out.println("material :" + titan.material);
		System.out.println("minutes :" + titan.minutes);

		titan.stopwatch();
		titan.light();
		titan.alarm();
		

	}

}





	