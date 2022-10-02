package encapsulationDemo;
//POJO
public class Employee {
	
	private String name;
	private int age;
	private String companyName = "Google";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >=18 && age <=62) {
			this.age = age;
		}else {
			this.age=0;
		}
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

}
