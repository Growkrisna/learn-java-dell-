public class oop2 {
    public static void main(String[] args) {
        String a = "Roselia";
        var person = new persona( a, "Jawa", "Indonesia");

        System.out.println(person.getName());
    }
}

class persona {
    private String Name ;
    private String Address;
    private String country;

    public String getName(){
        return Name + " " + country;
    }

    persona(String Name, String Address, String country){
        this.Name = Name;
        this.Address = Address;
        this.country = country;
        System.out.println("I am a person");
    }
}
