package testpackage;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	
	System.out.println("Input any integer number");
	int num= in.nextInt();
	
	System.out.println("Input any String");
	
	 String str=  in.next();
	 
	 System.out.println("Input decimal number");
	 
	  double decimal= in.nextDouble();
	  
	 char ch=  in.next().charAt(0);
	  
	  System.out.println(num);
	  System.out.println(str);
	  System.out.println(decimal);
	  System.out.println(ch);
	  
	  
	
	
}
}
