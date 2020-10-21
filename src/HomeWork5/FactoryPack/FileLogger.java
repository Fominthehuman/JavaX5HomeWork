package HomeWork5.FactoryPack;

public class FileLogger implements LoggerInterface {

    @Override
    public void makeLog(float outcome) {
        System.out.println("Log into file: " + outcome);
    }

}
