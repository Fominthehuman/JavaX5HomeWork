package HomeWork3.AnimalPack;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.eat() + ", " + animal.sleep());
        animal.showAnimalInfo();
    }

}
