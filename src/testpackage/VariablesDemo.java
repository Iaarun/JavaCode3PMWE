package testpackage;

public class VariablesDemo {
	// instance variable
	String name;
	//class
	static String course;

	public static void main(String[] args) {
		// variable syntax
		// datatype refname = value;

//		int num = 0;
//
//		System.out.println(num);
		
		VariablesDemo obj1 = new VariablesDemo();
		VariablesDemo obj2 = new VariablesDemo();
		
		obj1.name= "Shashank";
		obj1.course = "Java";
		
		obj2.name ="Amit";
		obj2.course="Selenium";
		
		System.out.println(obj1.name); //Amit
		System.out.println(obj1.course); // Java  //selenium
		System.out.println(obj2.name); //Shashank
		System.out.println(obj1.course); //selenium
		System.out.println(course);
		

	}

	public void test() {
		String name = "Arun";
	}

}
