package HomeWork5.FactoryPack;

import java.util.Scanner;

public class Calculator {

    Scanner in = new Scanner(System.in);
    float num1;
    float num2;
    float outcome;
    String action;

    LoggerFactory factory = new LoggerFactory();

    LoggerInterface consoleLog = factory.getLogger(LoggerTypes.CONSOLE);
    LoggerInterface databaseLog = factory.getLogger(LoggerTypes.DATABASE);
    LoggerInterface fileLog = factory.getLogger(LoggerTypes.FILE);

    public void startCalculator() {
        System.out.println("Введите первое число");
        num1 = in.nextInt();
        System.out.println("Введите второе число");
        num2 = in.nextInt();
        System.out.println("Выберете действие: / * + -");
        action = in.next();

        switch (action) {
            case "/":
                division();
                startCalculator();
            case "*":
                multiplication();
                startCalculator();
            case "+":
                addition();
                startCalculator();
            case "-":
                subtraction();
                startCalculator();
            default:
                System.out.println("Попробуйте еще раз");
                startCalculator();
        }
    }

    public void division() {
        outcome = num1 / num2;
        consoleLog.makeLog(outcome);
    }

    public void multiplication() {
        outcome = num1 * num2;
        databaseLog.makeLog(outcome);
    }

    public void addition() {
        outcome = num1 + num2;
        fileLog.makeLog(outcome);
    }

    public void subtraction() {
        outcome = num1 - num2;
        consoleLog.makeLog(outcome);
        databaseLog.makeLog(outcome);
        fileLog.makeLog(outcome);
    }

}
