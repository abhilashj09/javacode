


public class Month {

	public static void main(String[] args)

	{
		int month = 9;

		String months = " ";

		
		
		
		switch (month) {

		case 1:
			months = "1 : January";
			break;
		case 2:
			months = "2 : February";
			break;
		case 3:
			months = "3 : March";
			break;
		case 4:
			months = "4 : April";
			break;
		case 5:
			months = "5 : May";
			break;
		case 6:
			months = "6 : June";
			break;
		case 7:
			months = "7 : July";
			break;
		case 8:
			months = "8 : August";
			break;
		case 9:
			months = "9 : September";
			break;
		case 10:
			months = "10 : October";
			break;
		case 11:
			months = "11 : November";
			break;
		case 12:
			months = "12 : December";
			break;
		default:
			System.out.println("none");
		}

		System.out.println(months);

	}
}
