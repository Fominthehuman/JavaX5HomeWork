package HomeWork3.AnimalPack;

public class Dog extends Animal {

    protected boolean goodBoy;
    protected String dogBreed;
    protected String makeNoise;
    protected String food;
    protected String location;

    Dog() {
        goodBoy = true;
        dogBreed = "Corgy";
        makeNoise = "гавкает";
        food = "мясо";
        location = "на коврике";
    }

    public String isGoodBoy(boolean boy) {
        if (boy) {
            return ("Да");
        } else {
            return ("Нет");
        }
    }

    @Override
    public String makeNoise() {
        System.out.println("Собака");
        return super.makeNoise() + makeNoise;
    }

    @Override
    public String eat() {
        System.out.println("Собака");
        return super.eat() + food;
    }

    @Override
    public String sleep() {
        return super.sleep() + location;
    }

    @Override
    public void showAnimalInfo() {
        System.out.println("Порода собаки: " + dogBreed);
        System.out.println("Собака хорошая? -" + isGoodBoy(goodBoy));
    }

}
