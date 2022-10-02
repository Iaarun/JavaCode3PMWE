package collectionsDemo;

import java.util.ArrayList;
class Employee{
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	private int empId;
	
}
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayListDemo ad = new ArrayListDemo();
		ad.createArrayList();
		ad.test();
	}
	
	public void test() {
		Employee e1 = new Employee();
		e1.setName("Arun");
		e1.setEmpId(15901);
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		ArrayList<Employee> li= new ArrayList<Employee>();
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		System.out.println(li);
		
		System.out.println(li.get(0).getName());
		System.out.println(li.get(0).getEmpId());
		
		
	}
	
	
	
	
	public void createArrayList() {
		ArrayList <String>li = new ArrayList();
		li.add("Java");
		li.add("Java1");
		li.add("Java2");
		li.add("Java3");
		li.add("Java4");
		
		System.out.println(li.size());
	
		System.out.println(li.get(0));
		
		System.out.println(li);
		
	}
}
