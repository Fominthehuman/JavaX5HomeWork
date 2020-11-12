package HomeWork4.Task2;

public class Engine {

    private String engineManufacturer;
    private int enginePower;

    Engine(){

    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void showEngineInfo() {
        System.out.println("Power: " + enginePower);
        System.out.println("Manufacturer: " + engineManufacturer);
    }

}
