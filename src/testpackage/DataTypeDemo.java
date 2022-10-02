package testpackage;

public class DataTypeDemo {

	public static void main(String[] args) {
		byte b = 127;
		int i = 5465465;

		long l = 5415845545451545l;

		float fl = 4512.651545f;
		double db = 15466.6565656;
		
		char ch = '$';
		
		boolean bool = true;
		
		System.out.println(b);
	System.out.println(Integer.toBinaryString(b));
	
	double ab = b;
	System.out.println(ab);
	
	int a = (int)db;
	
	System.out.println(db);
	System.out.println(a);
	
	System.out.println(Integer.toBinaryString(10));
	}
}
