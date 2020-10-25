package HomeWork5.ComputerPack.Drive;

import HomeWork5.ComputerPack.Brands;

public class DriveSpecifications {

    private Brands driveBrand;
    private float driveVolume;
    private DriveTypes driveType;
    private String driveFormFactor;

    public Brands getDriveBrand() {
        return driveBrand;
    }

    public void setDriveBrand(Brands driveBrand) {
        this.driveBrand = driveBrand;
    }

    public float getDriveVolume() {
        return driveVolume;
    }

    public void setDriveVolume(float driveVolume) {
        this.driveVolume = driveVolume;
    }

    public String getDriveFormFactor() {
        return driveFormFactor;
    }

    public void setDriveFormFactor(String driveFormFactor) {
        this.driveFormFactor = driveFormFactor;
    }

    public DriveTypes getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveTypes driveType) {
        this.driveType = driveType;
    }

}
