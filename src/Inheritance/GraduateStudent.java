package Inheritance;

class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name, int age, String studentID, String researchTopic) {
        super(name, age, studentID);
        this.researchTopic = researchTopic;
    }

    void research() {
        System.out.println(name + " is researching on " + researchTopic);
    }
}
