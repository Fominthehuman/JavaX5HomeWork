package HomeWork5.FactoryPack;

public class ConsoleLogger implements LoggerInterface {

    @Override
    public void makeLog(float outcome) {
        System.out.println("Log into console " + outcome);
    }

}
