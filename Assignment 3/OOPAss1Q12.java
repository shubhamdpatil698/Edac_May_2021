/*12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]*/
import java.util.Scanner;
import java.lang.*;
class OOPAss1Q12
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter employee's salary :");
		float employeeSalary = s.nextFloat();
		float grossSalary,HRA,DA;
		if (employeeSalary<10000)
		{
			 HRA=(employeeSalary*10)/100;
			 DA=(employeeSalary*90)/100;
			 grossSalary=employeeSalary+HRA+DA;
			 System.out.println("Gross Salary of employee is :"+grossSalary);
		}
		else
		{
			 HRA=2000;
			 DA=(employeeSalary*98)/100;
			 grossSalary=employeeSalary+HRA+DA;
			 System.out.println("Gross Salary of employee is :"+grossSalary);
		}
		
	
	}
		
}