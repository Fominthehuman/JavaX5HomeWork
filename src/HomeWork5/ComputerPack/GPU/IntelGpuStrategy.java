package HomeWork5.ComputerPack.GPU;

import HomeWork5.ComputerPack.Brands;
import HomeWork5.ComputerPack.Computer;

public class IntelGpuStrategy implements GpuStrategy {

    @Override
    public void addGpu(Computer computer) {
        GpuSpecifications gpuSpecs = new GpuSpecifications(Brands.INTEL);
        gpuSpecs.setGpuBrand(Brands.INTEL);
        gpuSpecs.setGpuCoollingType("Air");
        gpuSpecs.setVramType("GDDR5");
        gpuSpecs.setVramVolume(512);
        computer.setGpu(gpuSpecs);
    }

}
