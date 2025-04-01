package Inheritance;

class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(Person person, String studentID, String researchTopic) {
        super(person, studentID);
        this.researchTopic = researchTopic;
    }

    void research() {
        System.out.println(name + " is researching on " + researchTopic);
    }
}
