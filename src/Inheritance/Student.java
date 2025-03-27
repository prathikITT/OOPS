package Inheritance;

class Student extends Person {
    String studentID;

    Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}




