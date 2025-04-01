package abstraction.shapofarea;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5*base*height;
    }
}
