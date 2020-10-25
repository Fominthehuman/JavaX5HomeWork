package HomeWork5.ComputerPack.RAM;

import HomeWork5.ComputerPack.Brands;

public class RamSpecifications {

    private Brands ramBrand;
    private float ramVolume;
    private double ramFrequency;
    private RamVersion ramVersion;

    public Brands getRamBrand() {
        return ramBrand;
    }

    public void setRamBrand(Brands ramBrand) {
        this.ramBrand = ramBrand;
    }

    public float getRamVolume() {
        return ramVolume;
    }

    public void setRamVolume(float ramVolume) {
        this.ramVolume = ramVolume;
    }

    public double getRamFrequency() {
        return ramFrequency;
    }

    public void setRamFrequencye(double ramFrequency) {
        this.ramFrequency = ramFrequency;
    }

    public RamVersion getRamVersion() {
        return ramVersion;
    }

    public void setRamVersion(RamVersion ramVersion) {
        this.ramVersion = ramVersion;
    }

}
