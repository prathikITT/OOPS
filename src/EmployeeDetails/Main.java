package EmployeeDetails;


public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Prathik", "Shetty", "07/12/1999", "1AXSDER4554F", "Software Engineer", "prathik@gmail.com");

        System.out.println("The Employee Name is " + obj.firstName + " " + obj.lastName + " Born on " + obj.dateOfBirth + " with Employer ID " + obj.id + " is of Designation " + obj.designation + " and mail id is " + obj.email);
    }
}

