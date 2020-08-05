
public class Math {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		sumOfTwo( a, b);
		
		int c = 40,  d =50;
		
		sumOfTwo( c, d);
		
		int e = 30,  f =20;
		
		sumOfTwo(e,f);
		
		
		sumOfTwo(55,12);
		
		int res= subOfTwo(60,30);
		System.out.println("sub of :" +res );
		
		
	
	}
		
		public static void sumOfTwo(int a, int b) {
			int sum= a + b;
			
			System.out.println(" sum: " +a + "&" +b +"is:" + sum);
		}
		
		public static int subOfTwo(int a, int b) {
			int sub= 0; //== a-b
		
			return sub;
		 
		}
}



