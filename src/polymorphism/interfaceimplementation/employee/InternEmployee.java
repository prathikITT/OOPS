package polymorphism.interfaceimplementation.employee;

public class InternEmployee implements Employee{
    double salary;

    public InternEmployee(double salary){
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    public String getEmployeeType(){
        return "Intern Employee";
    };
}
