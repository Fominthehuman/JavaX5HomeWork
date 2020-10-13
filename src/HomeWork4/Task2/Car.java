package HomeWork4.Task2;

public abstract class Car implements Turn {

    public String carBrand;
    public String carClass;
    public double carWeight;
    public Engine carEngine = new Engine();

    abstract void start();

    abstract void stop();

    abstract void printInfo();

    @Override
    public void turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public void turnLeft() {
        System.out.println("Поворот направо");
    }

}
