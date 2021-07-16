package employeesalarycalculator;

public class CommissionEmployee extends Employee {
	private double CommissionRate, baseSalary, totalSales;
	
	public CommissionEmployee() {
		super();
	}
	
	
	
	public CommissionEmployee(int employeeId, String firstName, String lastName, double rate, double baseSalary, double totalSales) {
		super(employeeId, firstName, lastName);
		CommissionRate = rate;
		this.baseSalary = baseSalary;
		this.totalSales = totalSales;
		
	}
	
	public double getCommissionRate() {
		return CommissionRate;
		
	}
	
	public double getbaseSalary() {
		return this.baseSalary;
		
	}
	
	public double gettotalSales() {
		return totalSales;
		
	}
	
	public void setCommissionRate(double rate) {
		this.CommissionRate = rate;
	}
	
	public void setbaseSalary(double salary) {
		this.baseSalary = salary;
	}
	
	public void settotalSales(double sales) {
		this.totalSales = sales;
	}
	
	
	public double calculateCommission() {
		return totalSales * CommissionRate;
		
	}
	
	public double calculateSalary() {
		return calculateCommission() * baseSalary;
		
	}
	
    public String toString() {        
        return  super.toString() + 
         String.format("%-20s %.2f%n", "Salary:", calculateSalary());
        
     }

 }

