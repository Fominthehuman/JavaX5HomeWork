package HomeWork5.ComputerPack;

public class RamSpecifications {

    String ramBrand = "Kingston";
    float ramVolume = 32;
    float ramFrequency = 4100;
    String ramType = "DDR4";

    public void showRamSpecs() {
        System.out.println("ramBrand: " + ramBrand);
        System.out.println("ramVolume: " + ramVolume + "Gb");
        System.out.println("ramFrequency: " + ramFrequency + "MHz");
        System.out.println("ramType: " + ramType);
        System.out.println("\n");
    }

}
