package Inheritance;

public class CollegeDemo {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Prathik", 25, "S12345", "Computer Science");
        gradStudent.displayInfo();
        gradStudent.study();
        gradStudent.research();
    }
}