package employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Huy", "Tran", 500);

		System.out.println("Firstname: " + e1.getFirstName());
		System.out.println("Lastname: " + e1.getLastName());
		System.out.println("Base salary: " + e1.getBaseSalary());


		EmployeeWithBonus e2 = new EmployeeWithBonus(e1, 25);
		System.out.println("\nFirstname: " + e2.getEmployee().getFirstName());
		System.out.println("Lastname: " + e2.getEmployee().getLastName());
		System.out.println("Base salary: " + e2.getEmployee().getBaseSalary());
		System.out.println("Earning: " + e2.earnings());
	}
}
