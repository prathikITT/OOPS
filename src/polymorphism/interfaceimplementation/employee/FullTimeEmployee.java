package polymorphism.interfaceimplementation.employee;

public class FullTimeEmployee implements Employee{
    double salary;

    public FullTimeEmployee(double salary){
       this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }

    public String getEmployeeType(){
        return "Full-Time Employee";
    };
}
