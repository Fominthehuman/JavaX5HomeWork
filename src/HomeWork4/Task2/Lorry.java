package HomeWork4.Task2;

public class Lorry extends Car {

    protected String carBrand;
    protected String carClass;
    protected double carWeight;
    protected int enginePower;
    protected String engineManufacturer;

    Lorry() {
        carBrand = "Scania";
        carClass = "Lorry";
        carWeight = 3;
        enginePower = 420;
        engineManufacturer = "Volkswagen Group";
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Brand: " + carBrand);
        System.out.println("Class: " + carClass);
        System.out.println("Weight: " + carWeight + "t");
        carEngine.engineInfo(enginePower, engineManufacturer);
    }

}
