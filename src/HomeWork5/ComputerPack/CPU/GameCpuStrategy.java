package HomeWork5.ComputerPack.CPU;

import HomeWork5.ComputerPack.Brands;
import HomeWork5.ComputerPack.Computer;

public class GameCpuStrategy implements CpuStrategy {

    @Override
    public void addCpu(Computer computer) {
        CpuSpecifications cpuSpecs = new CpuSpecifications(Brands.AMD);
        cpuSpecs.setCpuBrand(Brands.AMD);
        cpuSpecs.setCpuCache(12);
        cpuSpecs.setCpuCores(16);
        cpuSpecs.setCpuFrequency(3.5);
        computer.setCpuSpecs(cpuSpecs);
    }

}
