package HomeWork4.Task1;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double h;

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double square() {
        System.out.println("Треугольник");
        return ((0.5 * a * b) * Math.sin(Math.toRadians(h)));
    }

}
