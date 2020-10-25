package HomeWork5.ComputerPack;

import HomeWork5.ComputerPack.Drive.DriveTypes;
import HomeWork5.ComputerPack.RAM.RamVersion;

public class Main {

    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        Computer computer = computerFacade.buildNewComputer(12, RamVersion.DDR4, DriveTypes.SSD);
        System.out.println(computer.toString());
    }

}
