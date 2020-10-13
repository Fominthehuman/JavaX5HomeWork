package HomeWork5.ComputerPack;

public class DriveSpecifications {

    String driveBrand = "SAMSUNG";
    float driveVolume = 1000;
    String driveType = "SSD";
    String driveFormFactor = "2.5";

    public void showDriveSpecs() {
        System.out.println("driveBrand: " + driveBrand);
        System.out.println("driveVolume: " + driveVolume + "Mb");
        System.out.println("driveType: " + driveType);
        System.out.println("driveFormFactor: " + driveFormFactor + " inch");
        System.out.println("\n");
    }
}
