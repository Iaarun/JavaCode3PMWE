package testpackage;

import java.util.Scanner;

public class LoopStatement {
	
	/*
	 
* * * * *
* * * * * 
* * * * * 
* * * * * 



* 
* * 
* * *  
* * * * 


      *
    * * 
  * * *
* * * *
	 
	 
	 */
	public static void forloop() {

		/*
		 * for(initialization; condition; increment/decrement){ code }
		 */
		for (int i = 1; i <= 6; i = i + 1) {
			System.out.println("Hello Java!");
		}

	}

	public static void whileloop() {
		/*
		 * initialization;
		 * 
		 * while(condition){ code increment/decrement; }
		 */

		int i = 1;
		while (i <= 6) {
			System.out.println("Hello Java!");
			// i= i+1;
			// i++;
			i += 1;
		}
	}

	// print the sum of numbers from 1 to n

	public static void printsumofN2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int sum = (n * (n + 1)) / 2;
	}

	public static void printsumofN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void pattern3() {

		// outer loop is responsible for rows
		for (int i = 1; i <= 4; i++) {
            for(int k=i; k<4; k++) {
            	System.out.print(" ");
            }
			for (int j = 1; j <=i; j++) {
				System.out.print("*" );
			}
			System.out.println();
		}
	}

	public static void pattern2() {

		// outer loop is responsible for rows
		for (int i = 1; i <= 4; i++) {

			// inner for loop is responsible for column
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern1() {

		// outer loop is responsible for rows
		for (int i = 1; i <= 4; i++) {

			// inner for loop is responsible for column
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern4() {

		// outer loop is responsible for rows
		for (int i = 1; i <= 4; i++) {
            for(int k=i; k<=4; k++) {
            	System.out.print(" ");
            }
			for (int j = 1; j <=i; j++) {
				System.out.print("* " );
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		pattern4();

	}

}
