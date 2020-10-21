package HomeWork5.FactoryPack;

public class DbLogger implements LoggerInterface {

    @Override
    public void makeLog(float outcome) {
        System.out.println("Log into database: " + outcome);
    }

}
