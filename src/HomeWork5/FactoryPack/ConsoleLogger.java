package HomeWork5.FactoryPack;

public class ConsoleLogger extends Logger {

    @Override
    public void log(String message) {
        System.out.println("Log into console: " + message);
    }

}
