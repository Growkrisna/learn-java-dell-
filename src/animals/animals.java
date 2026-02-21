package animals;

public class animals {
    public static void main(String[] args) {
        AnimalClass[] animals = {
            new dog("Buddy"),
            new cat("Whiskers")
        };

        for (AnimalClass animal : animals) {
            animal.makeSound();
        }
    }
}
