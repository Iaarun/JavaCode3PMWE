package polymophismDemo;

public class Calculator {
	
	int a = 10;
	
	public Calculator() {
		System.out.println("Calculator Class");
	}
	
	public  void add(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public void test() {
		System.out.println("Inside Parent Class");
	}
	
	
	
	//changing the type of parameter
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	
	//changing the number of parameter
		public void add(double a, double b, double c) {
			System.out.println(a+b+c);
		}
		
		
		public void add(int a, double b) {
			System.out.println(a+b);
		}
		
		
		//changing the sequence of parameter
		public static void add(double a, int b) {
			System.out.println(a+b);
			System.out.println("Static function inside super class");
		}
		
		
		public static void main(String[] args) {
			Calculator cal = new Calculator();
			cal.add(45, 54.15, 15.456);
		}
		
		

}
