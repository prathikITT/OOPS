package polymorphism.interfaceimplementation.employee;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Employee Type: ");
        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.println("3. Intern");

        int choice = scanner.nextInt();
        Employee employee = null;

        switch (choice){
            case 1:
                System.out.println("Enter monthly salary: ");
                double monthlySalary = scanner.nextInt();

                employee = new FullTimeEmployee(monthlySalary);
                break;

            case 2:
                System.out.println("Dollars Per Hour ");
                double hourlyRate = scanner.nextInt();
                System.out.print("Enter No. of Hours Worked ");
                double hoursWorked = scanner.nextInt();
                employee = new PartTimeEmployee(hourlyRate, hoursWorked);
                break;

            case 3:
                System.out.println("Enter monthly salary: ");
                double internSalary = scanner.nextInt();
                employee = new InternEmployee(internSalary);
                break;

            default:
                System.out.println("Invalid Number");
                scanner.close();
        }
        System.out.println("\nEmployee Type: " + employee.getEmployeeType());
        System.out.println("Calculated Salary: $" + employee.calculateSalary());


    }

}
