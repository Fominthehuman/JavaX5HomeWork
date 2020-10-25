package HomeWork5.ComputerPack.GPU;

import HomeWork5.ComputerPack.Brands;
import HomeWork5.ComputerPack.Computer;

public class NvidiaGpuStrategy implements GpuStrategy {

    @Override
    public void addGpu(Computer computer) {
        GpuSpecifications gpuSpecs = new GpuSpecifications(Brands.NVIDIA);
        gpuSpecs.setGpuBrand(Brands.NVIDIA);
        gpuSpecs.setGpuCoollingType("Air");
        gpuSpecs.setVramType("GDDR5");
        gpuSpecs.setVramVolume(2048);
        computer.setGpu(gpuSpecs);
    }

}
