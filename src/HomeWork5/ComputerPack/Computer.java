package HomeWork5.ComputerPack;

import HomeWork5.ComputerPack.CPU.CpuSpecifications;
import HomeWork5.ComputerPack.Drive.DriveSpecifications;
import HomeWork5.ComputerPack.GPU.GpuSpecifications;
import HomeWork5.ComputerPack.RAM.RamSpecifications;

public class Computer {

    private CpuSpecifications cpuSpecs;
    private GpuSpecifications gpuSpecs;
    private DriveSpecifications driveSpecs;
    private RamSpecifications ramSpecs;

    public GpuSpecifications getGpuSpecs() {
        return gpuSpecs;
    }

    public void setGpu(GpuSpecifications gpuSpecs) {
        this.gpuSpecs = gpuSpecs;
    }

    public DriveSpecifications getDriveSpecs() {
        return driveSpecs;
    }

    public void setDrive(DriveSpecifications driveSpecs) {
        this.driveSpecs = driveSpecs;
    }

    public RamSpecifications getRamSpecs() {
        return ramSpecs;
    }

    public void setRamSpecs(RamSpecifications ramSpecs) {
        this.ramSpecs = ramSpecs;
    }

    public CpuSpecifications getCpuSpecs() {
        return cpuSpecs;
    }

    public void setCpuSpecs(CpuSpecifications cpuSpecs) {
        this.cpuSpecs = cpuSpecs;
    }

    @Override
    public String toString() {
        return "Computer specifications:\n" +
                "\nGPU: " + gpuSpecs.getGpuBrand() + " " + gpuSpecs.getVramVolume() + "Mb " + gpuSpecs.getVramType() + " " +
                "\nDrive: " + driveSpecs.getDriveBrand() + " " + driveSpecs.getDriveType() + " " + driveSpecs.getDriveVolume() + "Tb " +
                "\nRAM: " + ramSpecs.getRamBrand() + " " + ramSpecs.getRamVersion() + " " + ramSpecs.getRamVolume() + "Gb " + ramSpecs.getRamFrequency() + "MHz" +
                "\nCPU: " + cpuSpecs.getCpuBrand() + " " + cpuSpecs.getCpuFrequency() + "GHz " + cpuSpecs.getCpuCores() + "Cores " + cpuSpecs.getCpuCache() + "Mb";
    }

}
