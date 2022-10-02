package testpackage;

import oopsconcepts.Test1;

public class Test extends Test1 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name ="Ashwini";
		Student.course = "Selenium";
		
		
		Student s2 = new Student();
		s2.name = "Abhijit";
		
		
		Test t1 = new Test();
		t1.test3();
		t1.test1();
	}

}
