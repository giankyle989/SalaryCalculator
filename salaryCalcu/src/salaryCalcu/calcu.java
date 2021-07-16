package salaryCalcu;
import java.util.Scanner;

public class calcu {
	public double hoursWorked, totalSales, com, overtime, baseSalary, secondSalary, finalSalary, hoursOT;
	public String name;
	

	public Scanner i = new Scanner (System.in);
	double wage = 7.25;
	public void compute() {
		
		
		baseSalary = hoursWorked * wage;
		

		com = 0;
		if  ((totalSales>=1) && (totalSales<=99)) {
			com = 0.05;
		}
		if ((totalSales>=100) && (totalSales<=199)) {
			com = 0.1;
		}
		if (totalSales>=300) {
			com = 0.15;
		}
		

		double c = com * totalSales / 100 ;
		secondSalary = baseSalary + c;
		overtime = hoursOT * (wage * 1.5);
		finalSalary = secondSalary + overtime;
	}
	
	
	public void display() {
		
		System.out.print("\nSalary: " + secondSalary);
		System.out.print("\nOvertime Pay: " + overtime);
		System.out.print("\nTotal Salary: " + finalSalary);


		}
		
	}
	
