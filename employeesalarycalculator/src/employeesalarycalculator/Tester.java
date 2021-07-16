package employeesalarycalculator;



public class Tester {
	
	public static void main(String [] args) {

		Employee employees [] = new Employee[3];

		employees[0] = new HourlyEmployee(1, "Juan", "Hing", 10, 30); 
		employees[1] = new SalariedEmployee(2, "Jose", "Wews", 400); 
		employees[2] = new CommissionEmployee(3, "Pedro", "Nyark", 0.05, 100, 100); 
		
		for (int i=0; i<employees.length; i++) {
			System.out.println(employees[i]);
			System.out.println("\n");

		}
	}
}
	