package testpackage;

import java.util.Arrays;

public class StringsDemo {
	public static void main(String[] args) {
		createString();
	}
	
	// testagent12321@gmail.com     o/p = testagent12321
	
	public static void createString() {
		//using string literals
		String str = "Java";
		String str1 = "Java1";
		System.out.println(str);
		
		//using new keyword
		
		String str2 = new String("Java");
		String str3 = new String("JAVA").intern();
		System.out.println(str2);
		
		if(str==str3) {
			System.out.println("at same add");
		}else {
			System.out.println("diff add");
		}
		
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		 str=str.concat(" Test");
		System.out.println(str);
		
		String name= "My name is khan";
		System.out.println(name.charAt(name.length()-1));//M
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name.indexOf('n'));
		System.out.println(name.lastIndexOf('n'));
		
		System.out.println(name.contains("khan"));
		System.out.println(name.endsWith("khan"));
		System.out.println(name.startsWith("M"));
		
	  char[] ch=	name.toCharArray();
	  System.out.println(Arrays.toString(ch));
	  String age = "10";
	int ag=  Integer.parseInt(age);
	System.out.println(ag);
	
	 age = String.valueOf(ag);
	  name= "My name is khan";
	  System.out.println(name.length());
	 System.out.println(name.lastIndexOf('n'));
//	System.out.println(name.indexOf('n', 4));
	String []ar=  name.split(" ");
	for(String x:ar) {
		System.out.println(x);
	}
	
	
	
	System.out.println(name.replace(" ", ""));
	
	System.out.println(name.substring(0,5));
	
	// testagent12321@gmail.com     o/p = testagent12321
	
	String email = "testagent12321@gmail.com";
	System.out.println(email.split("@")[0]);
	
	System.out.println(email.substring(0, email.indexOf('@')));
	
	 
	}

}
