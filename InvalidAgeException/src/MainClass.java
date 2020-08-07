
public class MainClass {

	public static void main(String[] args) {

		Sample object = new Sample();

		try

		{

			String bar = object.checkNum(0);

		}

		catch (CustomException e)

		{

			e.printStackTrace();

		}

	}

}
