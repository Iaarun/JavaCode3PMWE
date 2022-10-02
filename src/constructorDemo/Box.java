package constructorDemo;

import java.util.Scanner;

public class Box {
	int len;
	int height;
	int width;
	
	//constructor
	//non parameterized constructor with no code inside it
	//can behave like a default constructor
	Box(){
		this(15,10,15);
		System.out.println("Inside constructor");
	}
	
	Box(int len, int width, int height){
		System.out.println("Inside Parameterised constructor");
		this.len =len;
		this.width=width;
		this.height=height;
		
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println(box.len);
		System.out.println(box.width);
		System.out.println(box.height);
		
//		Box b1 = new Box(15, 10, 15);
//	
//		System.out.println(b1.len);
//		System.out.println(b1.width);
//		System.out.println(b1.height);
	}

}
