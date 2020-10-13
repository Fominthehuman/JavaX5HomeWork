package HomeWork5.ComputerPack;

public class CpuSpecifications {

    float cpuFrequency = 3;
    int cpuCores = 8;
    float cpuCache = 16;
    String cpuName = "i9";
    String cpuBrand = "Intel";

    public void showCpuSpecs() {
        System.out.println("cpuBrand: " + cpuBrand);
        System.out.println("cpuName: " + cpuName);
        System.out.println("cpuFrequency: " + cpuFrequency + "Hz");
        System.out.println("cpuCores: " + cpuCores);
        System.out.println("cpuCache: " + cpuCache + "Mb");
        System.out.println("\n");
    }

}
