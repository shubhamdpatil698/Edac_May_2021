//1.Write a program to print the name, salary and date of joining of 10 employees in a company.Use array of objects
import java.util.*;

class Employee{
	String Ename;
	float ESalary;
	String EDOJ;
	Employee(String Ename,float Esalary,String EDOJ){
		this.Ename=Ename;
		this.ESalary=Esalary;
		this.EDOJ=EDOJ;
	}
	
}



public class AssQ1 {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Employee e []=new Employee[10];
		// initialize data
		e[0]=new Employee("Shubham",60000,"14/08/2021");
		e[1]=new Employee("Prathmesh",25000,"24/03/2021");
		e[2]=new Employee("Jaydeep",50000,"04/08/2020");
		e[3]=new Employee("Jawale",70000,"14/08/2021");
		e[4]=new Employee("Chavan",80000,"14/08/2021");
		e[5]=new Employee("Siddhesh",90000,"14/08/2021");
		e[6]=new Employee("Bhor",67000,"14/08/2021");
		e[7]=new Employee("Pardeshi",60000,"14/08/2021");
		e[8]=new Employee("Lalit",95000,"14/08/2021");
		e[9]=new Employee("Shubham",70000,"14/08/2021");
		for (int i=0; i<10; i++)
		{
			System.out.println(String.format("Employee Details are at %dth :\n%s\n%6.2f\n%s",i,e[i].Ename,e[i].ESalary,e[i].EDOJ));
		}
		
	}
}
