package polymophismDemo;

public class Test {
	
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		sc.test();
		
		Calculator calc = new Calculator();
		calc.test();
		
		Calculator calc1 =  new ScientificCalculator();
		calc1.test();
		System.out.println(calc1.a);
		
		System.out.println(sc.a);
		System.out.println(calc1.a);
	}

}
