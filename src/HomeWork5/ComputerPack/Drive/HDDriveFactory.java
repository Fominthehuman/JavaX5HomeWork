package HomeWork5.ComputerPack.Drive;

import HomeWork5.ComputerPack.Brands;

public class HDDriveFactory extends DriveFactory {

    @Override
    public DriveSpecifications newDrive() {
        DriveSpecifications hdDrive = new HDDrive();
        hdDrive.setDriveBrand(Brands.SEAGATE);
        hdDrive.setDriveVolume(2);
        hdDrive.setDriveFormFactor("5.5inch");
        hdDrive.setDriveType(DriveTypes.HDD);
        return hdDrive;
    }

}
