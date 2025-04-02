package polymorphism.interfaceimplementation.employee;

import java.util.Scanner;

public class PartTimeEmployee implements Employee {

    double hourlyRate;
    double hoursWorked;
    Scanner scanner = new Scanner(System.in);


    public PartTimeEmployee(double hourlyRate, double hoursWorked){
        this.hourlyRate = hourlyRate;;
        this.hoursWorked = hoursWorked;;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    public String getEmployeeType(){
        return "Part-Time Employee";
    };

    
}
