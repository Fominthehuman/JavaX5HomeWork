package HomeWork3.AnimalPack;

public class Animal {

    protected String food;
    protected String location;
    protected String makeNoise;

    Animal() {
        food = "ест ";
        location = "спит ";
        makeNoise = "издает звук ";
    }

    public String makeNoise() {
        return makeNoise;
    }

    public String eat() {
        return food;
    }

    public String sleep() {
        return location;
    }

    public void showAnimalInfo() {

    }

}
