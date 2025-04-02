package EmployeeDetails;

public class Employee {
    String firstName;
    String lastName;
    String dateOfBirth;
    String id;
    String designation;
    String email;

    public Employee(String firstName, String lastName, String dateOfBirth, String id, String designation, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.designation = designation;
        this.email = email;
    }
}