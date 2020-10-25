package HomeWork5.ComputerPack.GPU;

import HomeWork5.ComputerPack.Computer;

public class GraphicProcessor {

    Computer computer;

    public GraphicProcessor(Computer computer) {
        this.computer = computer;
    }

    public void addGpu(GpuStrategy gpuStrategy) {
        gpuStrategy.addGpu(computer);
    }

}
