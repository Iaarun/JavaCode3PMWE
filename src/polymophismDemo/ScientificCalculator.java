package polymophismDemo;

public class ScientificCalculator extends Calculator {
	int a = 30;
	
	
	public ScientificCalculator() {
     System.out.println("Inside child class constructor");
     
	}


	@Override
	public void add(int a, double b) {

		System.out.println(a * b);
	}

	public static void add(double a, int b) {
		System.out.println(a * b);
		System.out.println("Static function inside Sub class");
	}
	
	@Override
	public void test() {
		System.out.println("Inside child class");
	}

	public static void main(String[] args) {
           ScientificCalculator sc = new ScientificCalculator();
           ScientificCalculator.add(15.02, 15);
           
           Calculator.add(15.2, 62);
	}

}
