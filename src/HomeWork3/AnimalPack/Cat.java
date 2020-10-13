package HomeWork3.AnimalPack;

public class Cat extends Animal {

    protected String eyeColor;
    protected String catName;
    protected String makeNoise;
    protected String food;
    protected String location;

    Cat() {
        eyeColor = "green";
        catName = "Bamby";
        makeNoise = "мяукает";
        food = "молочко";
        location = "в корзиночке";
    }

    @Override
    public String makeNoise() {
        System.out.println("Кошка");
        return super.makeNoise() + makeNoise;
    }

    @Override
    public String eat() {
        System.out.println("Кошка");
        return super.eat() + food;
    }

    @Override
    public String sleep() {
        return super.sleep() + location;
    }

    @Override
    public void showAnimalInfo() {
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Имя кошки: " + catName);
    }

}
