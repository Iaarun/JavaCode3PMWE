package testpackage;

import java.util.Scanner;

/*
  if(condition){
    code
  }
  
  Take a number input from User and find if it is even number or odd
  Take three number input from user and find the maximum 
  
  Take three number input from user and calculate percentage
  based on percentage calculate the grade of user
  
  
  
 */
public class DescisionMaking {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		maxNum();
	}
	
	public static void maxNum() {
		System.out.println("Enter 1st Number");
		int a = in.nextInt();
		System.out.println("Enter 2nd Number");
		int b = in.nextInt();
		System.out.println("Enter 3rd Number");
		int c = in.nextInt();
		 
		int max=  (a>b)? (a>c? a:c):(b>c ? b:c);
		
		System.out.println(max);
		
		
	}
	
	public static void evenOdd() {
		System.out.println("Enter any Number");
		int num = in.nextInt();
		
		if(num % 2==0)
			System.out.println(num +" is Even");
		else
			System.out.println(num+" is Odd");
		
	}

	public static void ifdemo() {

		System.out.println("Is it raining?");

		boolean flag = in.nextBoolean();

		if (flag) {
			System.out.println("stay home");
		} else {
			System.out.println("lets go outing");
		}
	}

	public static void drivinglicensetest() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age");

		int age = in.nextInt();

		if (age >= 18) {
			System.out.println("Have you cleared the test");
			boolean teststatus = in.nextBoolean();
			if (teststatus) {
				System.out.println("Congratulation you will get your license");
			} else {
				System.out.println("PLease clear test first");
			}

		} else {
			System.out.println("Minor not eligible for license");
		}
	}

	public static void trafficesignal() {
		System.out.println("Check Signal ");
		String signalValue = in.next();

		if (signalValue.equalsIgnoreCase("green")) {
			System.out.println("GO");
		} else if (signalValue.equalsIgnoreCase("yellow")) {
			System.out.println("SLOWDOWN");
		} else if (signalValue.equalsIgnoreCase("red")) {
			System.out.println("STOP");
		} else {
			System.out.println("Take approriate decision");
		}
	}

	/*
	 * switch(expression){ case 1: code break; default: break; }
	 * 
	 * a+b a>b
	 */

	public static void switchCase() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Month Name");
		String month = in.next();
		switch(month) {
		case "jan":
			System.out.println("31 days");
			break;
		case "feb":
			System.out.println("28 days");
			break;
		case "mar":
			System.out.println("31 days");
			break;
		case "apr":
			System.out.println("30 days");
			break;
		case "may":
			System.out.println("31 days");
			break;
		case "jun":
			System.out.println("30 days");
			break;
		case "jul":
			System.out.println("31 days");
			break;
		case "aug":
			System.out.println("31 days");
			break;
		case "sep":
			System.out.println("30 days");
			break;
		case "oct":
			System.out.println("31 days");
			break;
		case "nov":
			System.out.println("30 days");
			break;
		case "dec":
			System.out.println("31 days");
			break;
		default:
			System.out.println("Enter correct month");
			break;
		}

	}
}
