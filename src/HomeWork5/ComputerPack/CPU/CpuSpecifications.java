package HomeWork5.ComputerPack.CPU;

import HomeWork5.ComputerPack.Brands;

public class CpuSpecifications {
    private Brands brand;
    private double cpuFrequency;
    private int cpuCores;
    private int cpuCache;
    private String name;
    private Brands cpuBrand;

    public CpuSpecifications(Brands brand) {
        this.brand = brand;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public int getCpuCache() {
        return cpuCache;
    }

    public void setCpuCache(int cpuCache) {
        this.cpuCache = cpuCache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brands getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(Brands cpuBrand) {
        this.cpuBrand = cpuBrand;
    }
}
