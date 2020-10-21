package HomeWork5.FactoryPack;

public class LoggerFactory {

    public LoggerInterface getLogger(LoggerTypes type) {
        LoggerInterface toReturn = null;
        switch (type) {
            case CONSOLE:
                toReturn = new ConsoleLogger();
                break;
            case DATABASE:
                toReturn = new DbLogger();
                break;
            case FILE:
                toReturn = new FileLogger();
                break;
            default:
                throw new IllegalArgumentException("Wrong logger type:" + type);
        }
        return toReturn;
    }

}
