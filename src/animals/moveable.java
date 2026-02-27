package animals;

abstract class AnimalClass {
    protected String name;
    private String species;
    protected int age;
    
    public AnimalClass(String name, String species){
        this.name = name;
        this.species = species;
    }

     public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public abstract void makeSound();
 
}


interface AnimalBehavior {
    void makeSound();
    void move();
    void eat();
}

class dog extends AnimalClass implements AnimalBehavior {

    public dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void move() {
        System.out.println(this.name + " : run.");
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " : WoOf!.");
    }

        @Override
    public void eat() {
        System.out.println(name + " : eats meat");
    }
}

class cat extends AnimalClass implements AnimalBehavior {

    public cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " : meows.");
    }

    @Override
    public void move() {
        System.out.println(this.name + " : walks gracefully.");
    }

        @Override
    public void eat() {
        System.out.println(name + " : eats meat");
    }

}
