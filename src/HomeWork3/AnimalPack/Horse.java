package HomeWork3.AnimalPack;

public class Horse extends Animal {

    protected int horseAge;
    protected int weight;
    protected String makeNoise;
    protected String food;
    protected String location;

    Horse() {
        horseAge = 18;
        weight = 200;
        makeNoise = "иногда ржет";
        food = "травку";
        location = "в загоне";
    }

    @Override
    public String makeNoise() {
        System.out.println("Лошадь");
        return super.makeNoise() + makeNoise;
    }

    @Override
    public String eat() {
        System.out.println("Лошадь");
        return super.eat() + food;
    }

    @Override
    public String sleep() {
        return super.sleep() + location;
    }

    @Override
    public void showAnimalInfo() {
        System.out.println("Возраст лошади: " + horseAge);
        System.out.println("Вес лошади: " + weight + "Кг");
    }

}
