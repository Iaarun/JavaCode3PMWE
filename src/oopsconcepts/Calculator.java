package oopsconcepts;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a = sub(45, 15);
		System.out.println(a + 100);
		int b = multi(41, 21);
		System.out.println(b + 100);
		cal.divide(61, 12);
		cal.add(15, 10);

		int pa = 10000;
		double roi = 5.5;
		int time = 5;
		double interest = simpleInterest(pa, roi, time);
		double totalAmount = pa + interest;
	}
	// public static void identifier(){};

	public static double simpleInterest(int pa, double roi, int time) {

		double interest = (pa * roi * time) / 100;
		return interest;
	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static int sub(int a, int b) {

		int sub = a - b;
		return sub;

	}

	public static int multi(int a, int b) {

		int multi = a * b;
		return multi;
	}

	public void divide(int a, int b) {

		int divide = a / b;
		System.out.println(divide);
	}
}
