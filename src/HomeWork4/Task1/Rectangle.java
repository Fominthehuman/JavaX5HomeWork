package HomeWork4.Task1;

public class Rectangle implements Shape {

    private final double a;
    private final double b;

    public Rectangle() {
        a = 3.5;
        b = 4;
    }

    @Override
    public double square() {
        System.out.println("Прямоугольник");
        return (a * b);
    }

}
