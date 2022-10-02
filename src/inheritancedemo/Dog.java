package inheritancedemo;

//single inheritance
public class Dog extends Animal{

	public static void climb() {
		System.out.println("Dogs cant climb");
	}
	
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name="Bruno";
		d.breed="Labrador";
		
		d.speak("woof");
		d.climb();
	}
}
