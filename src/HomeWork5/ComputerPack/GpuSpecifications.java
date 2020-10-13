package HomeWork5.ComputerPack;

public class GpuSpecifications {

    String gpuBrand = "AMD";
    float vramVolume = 8;
    String gpuCollingType = "Active";
    String vramType = "GDDR5";

    public void showGpuSpecs() {
        System.out.println("gpuBrand: " + gpuBrand);
        System.out.println("vramVolume: " + vramVolume + "Gb");
        System.out.println("videoRamType: " + vramType);
        System.out.println("gpuCollingType: " + gpuCollingType);
        System.out.println("\n");
    }

}
