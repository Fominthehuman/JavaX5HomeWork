package HomeWork5.ComputerPack.GPU;

import HomeWork5.ComputerPack.Brands;

public class GpuSpecifications {

    private Brands brand;
    private Brands gpuBrand;
    private float vramVolume;
    private String gpuCoollingType;
    private String vramType;

    public GpuSpecifications(Brands brand) {
        this.brand = brand;
    }

    public Brands getGpuBrand() {
        return gpuBrand;
    }

    public void setGpuBrand(Brands gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public float getVramVolume() {
        return vramVolume;
    }

    public void setVramVolume(float vramVolume) {
        this.vramVolume = vramVolume;
    }

    public String getGpuCoollingType() {
        return gpuCoollingType;
    }

    public void setGpuCoollingType(String gpuCoollingType) {
        this.gpuCoollingType = gpuCoollingType;
    }

    public String getVramType() {
        return vramType;
    }

    public void setVramType(String vramType) {
        this.vramType = vramType;
    }

}
