package HomeWork4.Task2;

public class SportCar extends Car {

    protected int enginePower;
    protected String engineManufacturer;

    public SportCar() {
        this.carBrand = "Spyker";
        this.carClass = "SportCar";
        this.carWeight = 1.5;
        this.engine.setEnginePower(500);
        this.engine.setEngineManufacturer("Swedish Automobile N.V.");
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
        System.out.println("Brand: " + this.carBrand);
        System.out.println("Class: " + this.carClass);
        System.out.println("Weight: " + this.carWeight + "t");
        this.engine.showEngineInfo();
    }

}
