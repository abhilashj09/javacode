
public class Sample {

	// smallest of 3 numbers

	public static void main(String[] args)

	{

		int a = 10, b = 20, c = -1;

		String result;

		result = (a < b) ? ((a < c) ? "a is smallest" : "c is smallest")
				: ((b < c) ? "b is smallest" : "c is smallest");

		System.out.println(result);

	}

}
