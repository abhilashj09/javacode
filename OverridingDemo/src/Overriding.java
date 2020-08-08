
class Names

{
	public void show() {
		System.out.println("calling Name");
	}
}

class Mike extends Names {
	public void show() {
		System.out.println("calling Mike");
	}

}

class Rob extends Names {
	public void show() {

		System.out.println("calling Rob");
	}
}

public class Overriding {

	public static void main(String[] args) {

		Names object = new Mike();
		object.show();

		object = new Rob();
		object.show();

	}

}
