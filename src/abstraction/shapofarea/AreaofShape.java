package abstraction.shapofarea;

public class AreaofShape {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle = new Rectangle(3, 6);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(circle.area());

    }
}
