
public class DataType {

	void sum(int a, float b) {
		int sum = (int) (a + b);
		System.out.println("sum of no is " + sum);

	}

	void sum(double a, double b) {
		double sum = a + b;
		System.out.println("sum of no is " + sum);
	}

	
	void sum(long a, long b) {
		long sum = (a + b);
		System.out.println("sum of no is " + sum);

	}
	public static void main(String[] args) {
		DataType value = new DataType();
		value.sum(5, 10.5);
		value.sum(5.0, 2.0);
        value.sum(100000000l, 20000000l);  
	}

}
