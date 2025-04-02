package Inheritance;

class Student extends Person {
    String studentID;

    public Student(Person person, String studentID) {
        super(person);
        this.studentID = studentID;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}




