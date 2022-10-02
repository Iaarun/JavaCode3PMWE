package testpackage;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		arraysort();
	}
	public static void arraysort() {
		int arr[] = {12,15,10,5,45}; //5 10 12 15 45
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void maxandmin() {
		int arr[] = {12,15,10,5,45};
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		

		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		
		
		System.out.println(max);//45
		System.out.println(min);
		
	}
	
	public static void array1() {
		int arr[] = {12,15,10};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		//	sum = sum+arr[i];
//		}
		
		
		//enhanced for loop
		int sum=0;
		for(int x:arr) {
		//	System.out.println(x);
			//sum = sum+x;
			sum +=x;
		}
		
		System.out.println(sum);
	}
	//Take the input from user and store the data in array
	
	public static void createArr() {
		 int[] arr = new int [9];
		
//		String [] names = new String [10];
//		
//		char[] ch = new char[10];
		 arr[0]=10;
		 System.out.println(arr.length);
		 System.out.println(arr[1]);
		 System.out.println(arr[0]);
		 System.out.println(Arrays.toString(arr));
	}

}
