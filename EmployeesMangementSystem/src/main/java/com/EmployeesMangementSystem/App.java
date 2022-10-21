package com.EmployeesMangementSystem;

//import packages
import java.util.Scanner;

import com.EmployeesMangSystem.mode.Employees;
import com.EmployeesMangementSystem.Emp.EmployeesEmp;
import com.EmployeesMangementSystem.EmpImpl.EmployeesEmpImpl;

/**
 * Hello world!
 *
 */
//declaring class
public class App {

	// adding menu
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employees");
		System.out.println("2. Delete Employees");
		System.out.println("3. Update Employees");
		System.out.println("4. Display all the Employees");
		System.out.println("5.Exit");
	}

	// calling main method
	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeesEmp company = new EmployeesEmpImpl();

		// declaring varible choice
		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				int Empid;
				switch (ch) {
				case 1:
					company.addEmpolyees();
					System.out.println("Employee inserted..........");
					break;
				case 2:
					System.out.println("Enter the Employee Id to be deleted:");
					int id = sc1.nextInt();
					boolean flag = company.deleteEmpolyees(id);
					if (flag)
						System.out.println("Employee deleted.......");
					else
						System.out.println(".....No Record found......");
					break;

				// case 3:
				// System.out.println("Enter the Id to be updated:");
				// id = sc1.nextInt();
				// flag = Employees.updateEmployees(id);
				// if (flag)
				// System.out.println("Employee updated......");
				// else
				// System.out.println(".....No Record found......");
				// break;
				case 4:
					Employees.displayAll();
					break;

				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input.......");

				}

			} while (ch != 6);

			// end of do while

			sc1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
