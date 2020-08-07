
public class Sample {

	private int i;

	public String checkNum(int num)

			throws CustomException

	{

		if (i == 0)

		{

			throw new CustomException("Number is zero");

		}

		else

		{

			return "Number is non zero";

		}

	}

}
