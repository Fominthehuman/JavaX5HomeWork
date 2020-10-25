package HomeWork5.ComputerPack.CPU;

import HomeWork5.ComputerPack.Computer;

public class CentralProcessor {
    Computer computer;

    public CentralProcessor(Computer computer) {
        this.computer = computer;
    }


    public void AddCpu(CpuStrategy cpuStrategy) {
        cpuStrategy.addCpu(computer);
        ;
    }
}
