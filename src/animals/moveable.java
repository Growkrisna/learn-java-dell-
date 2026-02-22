package animals;

abstract class AnimalClass {
    protected String name;
    private String species;
    
    public AnimalClass(String name, String species){
        this.name = name;
        this.species = species;
    }

    public abstract void makeSound();
 
}

public interface moveable{
    void move();

    
}

class dog extends AnimalClass implements moveable {

    public dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void move() {
        System.out.println(this.name + " : run.");
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " : barks.");
    }
}

class cat extends AnimalClass {

    public cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " : meows.");
    }

    @Override
    public void move() {
        System.out.println(name + " walks gracefully.");
    }

}