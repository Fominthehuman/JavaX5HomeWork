package HomeWork5.ComputerPack.GPU;

import HomeWork5.ComputerPack.Brands;
import HomeWork5.ComputerPack.Computer;

public class AmdGpuStrategy implements GpuStrategy {

    @Override
    public void addGpu(Computer computer) {
        GpuSpecifications gpuSpecs = new GpuSpecifications(Brands.AMD);
        gpuSpecs.setGpuBrand(Brands.AMD);
        gpuSpecs.setGpuCoollingType("Wather");
        gpuSpecs.setVramType("GDDR6");
        gpuSpecs.setVramVolume(4096);
        computer.setGpu(gpuSpecs);
    }

}
