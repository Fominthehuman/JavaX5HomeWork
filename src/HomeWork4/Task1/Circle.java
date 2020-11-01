package HomeWork4.Task1;

public class Circle implements Shape {

    private double r;

    public Circle(double radius) {
        r = radius;
    }

    @Override
    public double square() {
        System.out.println("Круг");
        return (r * r * Math.PI);
    }

}
