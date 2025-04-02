package Inheritance;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
}

