package Interface.animals;

public class Dog implements Animals{
    @Override
    public void eat() {
        System.out.println("Cat drinks FOOD");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Says woof");
    }
}
