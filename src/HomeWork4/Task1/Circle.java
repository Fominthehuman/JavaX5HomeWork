package HomeWork4.Task1;

public class Circle implements Shape {

    private final double r;

    public Circle() {
        r = 3.5;
    }

    @Override
    public double square() {
        System.out.println("Круг");
        return (r * r * Math.PI);
    }

}
