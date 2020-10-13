package HomeWork4.Task2;

public class SportCar extends Car {

    protected String carBrand;
    protected String carClass;
    protected double carWeight;
    protected int enginePower;
    protected String engineManufacturer;

    SportCar() {
        carBrand = "Spyker";
        carClass = "SportCar";
        carWeight = 1.5;
        enginePower = 500;
        engineManufacturer = "Swedish Automobile N.V.";
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Brand: " + carBrand);
        System.out.println("Class: " + carClass);
        System.out.println("Weight: " + carWeight + "t");
        carEngine.engineInfo(enginePower, engineManufacturer);
    }

}
