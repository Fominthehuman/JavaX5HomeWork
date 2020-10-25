package HomeWork5.ComputerPack.RAM;

import HomeWork5.ComputerPack.Brands;

public class DesktopRamFactory extends RamFactory {

    @Override
    public RamSpecifications newRam() {
        RamSpecifications desktopRam = new DesktopRam();
        desktopRam.setRamVersion(RamVersion.DDR3L);
        desktopRam.setRamBrand(Brands.SAMSUNG);
        desktopRam.setRamVolume(16);
        desktopRam.setRamFrequencye(2.1);
        return desktopRam;
    }

}
