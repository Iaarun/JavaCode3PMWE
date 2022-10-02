package inheritancedemo;

public class BabyDog extends Dog {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.age = 1;
		climb();
		bd.speak("woof");
	}
}
