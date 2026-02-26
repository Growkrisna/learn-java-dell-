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
            if (animal instanceof moveable) {
                ((moveable) animal).move();
            }
        }

        moveable m = new dog("Charlie");
        m.move();
        
        if(m instanceof dog){
            dog d = (dog) m;
            d.makeSound();  
        }

        System.out.println();

        ArrayList<AnimalBehavior> a = new ArrayList<>();
        a.add(new dog("KillKiSS"));
        
        for (AnimalBehavior animal : a) {
            animal.makeSound();
            animal.move();
        }

        System.out.println();

        
    }
}
