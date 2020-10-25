package HomeWork5.ComputerPack.RAM;

import HomeWork5.ComputerPack.Brands;

public class GamingRamFactory extends RamFactory {

    @Override
    public RamSpecifications newRam() {
        RamSpecifications gamingRam = new GamingRam();
        gamingRam.setRamVersion(RamVersion.DDR4);
        gamingRam.setRamBrand(Brands.KINGSTON);
        gamingRam.setRamVolume(32);
        gamingRam.setRamFrequencye(3.2);
        return gamingRam;
    }

}
