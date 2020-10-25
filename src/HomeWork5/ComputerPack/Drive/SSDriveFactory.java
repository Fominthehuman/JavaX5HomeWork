package HomeWork5.ComputerPack.Drive;

import HomeWork5.ComputerPack.Brands;

public class SSDriveFactory extends DriveFactory {

    @Override
    public DriveSpecifications newDrive() {
        DriveSpecifications ssDrive = new SSDrive();
        ssDrive.setDriveBrand(Brands.SAMSUNG);
        ssDrive.setDriveVolume(1);
        ssDrive.setDriveFormFactor("3.5inch");
        ssDrive.setDriveType(DriveTypes.SSD);
        return ssDrive;
    }

}
