package HomeWork5.ComputerPack;

import HomeWork5.ComputerPack.CPU.CentralProcessor;
import HomeWork5.ComputerPack.CPU.CpuStrategy;
import HomeWork5.ComputerPack.CPU.GameCpuStrategy;
import HomeWork5.ComputerPack.CPU.ServerCpuStrategy;
import HomeWork5.ComputerPack.Drive.DriveFactory;
import HomeWork5.ComputerPack.Drive.DriveTypes;
import HomeWork5.ComputerPack.Drive.HDDriveFactory;
import HomeWork5.ComputerPack.Drive.SSDriveFactory;
import HomeWork5.ComputerPack.GPU.AmdGpuStrategy;
import HomeWork5.ComputerPack.GPU.GraphicProcessor;
import HomeWork5.ComputerPack.GPU.GpuStrategy;
import HomeWork5.ComputerPack.GPU.IntelGpuStrategy;
import HomeWork5.ComputerPack.GPU.NvidiaGpuStrategy;
import HomeWork5.ComputerPack.RAM.DesktopRamFactory;
import HomeWork5.ComputerPack.RAM.GamingRamFactory;
import HomeWork5.ComputerPack.RAM.RamFactory;
import HomeWork5.ComputerPack.RAM.RamVersion;

public class ComputerFacade {

    public Computer buildNewComputer(int tFlops, RamVersion ramVersion, DriveTypes driveType) {  //tFlops - производительность
        Computer computer = new Computer();

        GraphicProcessor graphicProcessor = new GraphicProcessor(computer);
        GpuStrategy gpuStrategy;
        if (tFlops > 10) {
            gpuStrategy = new AmdGpuStrategy();
        } else if (tFlops < 2) {
            gpuStrategy = new IntelGpuStrategy();
        } else {
            gpuStrategy = new NvidiaGpuStrategy();
        }
        graphicProcessor.addGpu(gpuStrategy);

        RamFactory ramFactory;
        if (ramVersion == RamVersion.DDR4) {
            ramFactory = new GamingRamFactory();
        } else {
            ramFactory = new DesktopRamFactory();
        }
        computer.setRamSpecs(ramFactory.newRam());

        DriveFactory driveFactory;
        switch (driveType) {
            case HDD:
                driveFactory = new HDDriveFactory();
                break;
            case SSD:
                driveFactory = new SSDriveFactory();
                break;
            default:
                driveFactory = new SSDriveFactory();
        }
        computer.setDrive(driveFactory.newDrive());

        CentralProcessor centralProcessor = new CentralProcessor(computer);
        CpuStrategy cpuStrategy;
        if (computer.getGpuSpecs().getVramVolume() > 2000) {
            cpuStrategy = new GameCpuStrategy();
        } else {
            cpuStrategy = new ServerCpuStrategy();
        }
        centralProcessor.AddCpu(cpuStrategy);

        return computer;

    }

}
