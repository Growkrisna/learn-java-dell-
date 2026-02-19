package animals;

class AnimalClass {
    private String name;
    private String species;
    
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
