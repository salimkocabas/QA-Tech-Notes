package _086_encapsulation;

public class Employee {
	
	public String name="Mike";
	private String ssn="123-4568-3640";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return ssn.substring(9);
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	
}
