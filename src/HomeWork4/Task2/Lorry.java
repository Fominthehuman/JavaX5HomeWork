package HomeWork4.Task2;

public class Lorry extends Car {

    private int enginePower;
    private String engineManufacturer;

    public Lorry() {
        this.carBrand = "Scania";
        this.carClass = "Lorry";
        this.carWeight = 3;
        this.engine.enginePower = 420;
        this.engine.engineManufacturer = "Volkswagen Group";
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
        this.engine.showEngineInfo();
    }

    ;

}
