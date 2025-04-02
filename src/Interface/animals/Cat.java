package Interface.animals;

public class Cat implements Animals{
    @Override
    public void eat(){
        System.out.println("Cat drinks Milk");
    }

    @Override
    public void makeSound(){
        System.out.println("Cat Says meowww");
    }
}
