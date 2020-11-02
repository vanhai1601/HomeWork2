package employee;

public class Employee {
	private String firstName;
	private String lastName;
	private double baseSalary;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, double baseSalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setBaseSalary(baseSalary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0) {
			this.baseSalary = baseSalary;
			return;
		}
	}

}

