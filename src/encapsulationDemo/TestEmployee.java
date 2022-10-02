package encapsulationDemo;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setName("Arun");
		emp1.setCompanyName("Amazon");
		emp1.setAge(451);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getCompanyName());
	}

}
