package HomeWork5.ComputerPack.CPU;

import HomeWork5.ComputerPack.Brands;
import HomeWork5.ComputerPack.Computer;

public class ServerCpuStrategy implements CpuStrategy {

    @Override
    public void addCpu(Computer computer) {
        CpuSpecifications cpuSpecs = new CpuSpecifications(Brands.INTEL);
        cpuSpecs.setCpuBrand(Brands.INTEL);
        cpuSpecs.setCpuCache(24);
        cpuSpecs.setCpuCores(20);
        cpuSpecs.setCpuFrequency(5);
        computer.setCpuSpecs(cpuSpecs);
    }

}
