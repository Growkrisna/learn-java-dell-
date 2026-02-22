package animals;
import java.util.ArrayList;

public class animals {
    public static void main(String[] args) {
        ArrayList<AnimalClass> animals = new ArrayList<>();
        animals.add(new dog("Buddy"));
        animals.add(new cat("Whiskers"));
        animals.add(new dog("Max"));

        for (AnimalClass animal : animals) {
            animal.makeSound();
        }
    }
}
