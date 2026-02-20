package animals;

public class animals {
    public static void main(String[] args) {
        AnimalClass dog = new AnimalClass("Buddy", "Dog");
        dog.makeSound();

        AnimalClass cat = new AnimalClass("Whiskers", "Cat");
        cat.makeSound();

        dog dog2 = new dog("Rex");
        dog2.makeSound();
    }
}
