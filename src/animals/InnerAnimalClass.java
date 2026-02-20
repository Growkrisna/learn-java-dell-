package animals;

class AnimalClass {
    protected String name;
    protected String species;
    
    public AnimalClass(String name, String species){
        this.name = name;
        this.species = species;
    }

    public void makeSound(){
        if (species.equals("Cat")) {
            System.out.println(this.name + " : meows.");
        } else {
            System.out.println(this.name + " : makes a sound.");
        }
    }
}

class dog extends AnimalClass {

    public dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " : barks.");
    }
}
