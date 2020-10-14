package HomeWork4.Task2;

public abstract class Car implements Turn {

    public String carBrand;
    public String carClass;
    public double carWeight;

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    Engine engine = new Engine();

    @Override
    public void turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public void turnLeft() {
        System.out.println("Поворот направо");
    }

}
