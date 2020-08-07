
class MyExceptionNew extends Exception 
{

	public static void main(String args[]) {
		try {
			
			throw new MyExceptionNew();
		} catch (MyExceptionNew ex) {
			System.out.println("It's Caught");
			System.out.println(ex.getMessage());
		}
	}
}