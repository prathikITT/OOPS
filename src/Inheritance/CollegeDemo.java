package Inheritance;

public class CollegeDemo {
    public static void main(String[] args) {
        Person person = new Person("Prathik", 25);
        GraduateStudent gradStudent = new GraduateStudent( person, "S12345", "Computer Science");
        gradStudent.displayInfo();
        gradStudent.study();
        gradStudent.research();
    }
}