package salary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int emp_id;
	String emp_name;
	float basic_salary;

	Employee(int id, String name, float sal) {
		emp_id = id;
		emp_name = name;
		basic_salary = sal;
	}

	void display() {
		float da = basic_salary * 15 / 100;
		float hra = basic_salary * 10 / 100;
		float gross_sal = basic_salary + da + hra;
		System.out.println("Employee Id= " + emp_id);
		System.out.println("Emplyee Name= " + emp_name);
		System.out.println("Gross Salary= " + gross_sal);
	}
}// Employee

class q4Employee {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Name");
		String name = br.readLine();
		System.out.println("Enter Basic Salary");
		Float sal = Float.parseFloat(br.readLine());
		Employee e = new Employee(id, name, sal);
		e.display();
	}
}
