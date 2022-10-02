package testpackage;

public class OperatorsDemo {
	public static void main(String[] args) {
		ternaryOperator();
	}
	
	public static void ternaryOperator() {
		// condition ? expression1 : expression2
		
		int a=20;
		int b=23;
		
	int result=	(a>b)? (a+b): (a-b);
	System.out.println(result);
	}
	
	public static void logicanAndOr() {
		// &&  ||
		
		int a =20;
		int b = 3;
		
		System.out.println((a<b) && (a!=b));//false
		System.out.println((a<b) || (a!=b));//true
	}
	
	public static void comparisonoperator() {
		//  == > <  >= <= !=
		int a =20;
		int b = 3;
		
		System.out.println( a==b); //false
		System.out.println( a>b); //true
		System.out.println( a<b); //false
		System.out.println( a>=b); //true
		System.out.println( a<=b);//false
		System.out.println( a!=b);// true
	}
	
	public static void arithmaticoperator() {
		// + - / * %
		
		int a=20;
		int b =3;
		
		System.out.println(a+b);//23
		System.out.println(a-b);//17
		System.out.println(a*b);//60
		System.out.println(a/b);//6
		System.out.println(a%b);//2
	}

}
