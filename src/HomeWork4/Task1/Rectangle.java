package HomeWork4.Task1;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double length, double width) {
        a = length;
        b = width;
    }

    @Override
    public double square() {
        System.out.println("Прямоугольник");
        return (a * b);
    }

}
