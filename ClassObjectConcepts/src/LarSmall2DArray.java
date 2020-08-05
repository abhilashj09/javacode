
public class LarSmall2DArray {

	static int myFind(int[][] arr) {
		int values = arr[0][0];

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++)

			{
				if (values < arr[i][j]) {
					values = arr[i][j];
				}
			}
		}

		return values;
	}

	public static void main(String[] args) {

		System.out.println(myFind(new int[][] { { 98, 14, 19 }, { 75, 5, 36 }, { 25, 45, 96 } }));
	}

}
