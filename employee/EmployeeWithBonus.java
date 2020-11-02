package employee;

public class EmployeeWithBonus {
	private Employee employee;
	private double bonus;
	
	public EmployeeWithBonus(Employee employee, double bonus) {
		this.employee = employee;
		setBonus(bonus);
	}
	public double earnings() {
		return employee.getBaseSalary() + bonus;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
