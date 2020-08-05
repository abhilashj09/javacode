
public class DisplayValues {
	
	DisplayValues(){
		System.out.println("this is no arg constr");
	}
	
	
	
	void display(String strvalue) {
		System.out.println("the string value:" +strvalue);
		
	}

	void display(String strValue, char charValue) {
		System.out.println("the string value:" +strValue);
		System.out.println("the string value:" +charValue);
	}
	
	void display(char charValue, int intValue) {
		System.out.println("the string value:" +charValue);
		System.out.println("the string value:" +intValue);
	}
	public static void main(String[] args) {
		
		DisplayValues disp = new DisplayValues();
		
		disp.display("Hello");
		
		disp.display("Hello", 'k');
		
		disp.display('K', 2);
	}

}
