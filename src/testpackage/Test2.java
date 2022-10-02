package testpackage;

public class Test2 {
  String name= "Java";
	public static void main(String[] args) {
		Test2 t= new Test2();
		
		String name = "Python";
		t.name = name.concat("Test");
		System.out.println(t.name);
	}
}
