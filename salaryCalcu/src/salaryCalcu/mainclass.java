package salaryCalcu;


public class mainclass {
			static calcu x = new calcu();
		
	public static void main(String[] args) {

		System.out.print("Employee Name: ");
		x.name = x.i.next();
		
		System.out.print("Hours Worked: ");
		x.hoursWorked = x.i.nextDouble();
		
		System.out.print("Overtime: ");
		x.hoursOT = x.i.nextDouble();
		
		System.out.print("Total Sales: ");
		x.totalSales= x.i.nextDouble();
		
		x.compute(); x.display(); 
	}

}
