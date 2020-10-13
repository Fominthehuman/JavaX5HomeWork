package HomeWork3.AnimalPack;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Horse()};

        for (int i = 0; i < animals.length; i++) {
            Veterinarian veterinarian = new Veterinarian();
            veterinarian.treatAnimal(animals[i]);
        }

    }

}
