
public class AdditionOfNumbers {

	int a;
	int b;
	int c;

	public AdditionOfNumbers(int inputa, int inputb, int inputc) {
		a = inputa;
		b = inputb;
		c = inputc;
	}

	void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: " + sum);

	}

	void sum(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("sum of 3 : " + sum);

	}

	public static void main(String[] args) {

		AdditionOfNumbers add = new AdditionOfNumbers(10, 20, 30);
		add.sum(add.a, add.b,add.c);

	}
}
