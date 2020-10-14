package HomeWork4.Task2;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Car[] car = new Car[2];
        car[0] = new Lorry();
        car[1] = new SportCar();
        for (Car cr : car) {
            cr.start();
            cr.turnRight();
            cr.printInfo();
            cr.turnLeft();
            cr.stop();
            System.out.println();
        }
    }

}
