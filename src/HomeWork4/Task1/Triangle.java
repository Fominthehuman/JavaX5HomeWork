package HomeWork4.Task1;

public class Triangle implements Shape {

    private final double a;
    private final double b;
    private final double ab;

    public Triangle() {
        a = 3.5;
        b = 4;
        ab = 30;
    }

    @Override
    public double square() {
        System.out.println("Треугольник");
        return ((0.5 * a * b) * Math.sin(Math.toRadians(ab)));
    }

}
