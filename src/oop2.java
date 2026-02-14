public class oop2 {
    public static void main(String[] args) {
        String a = "Hello World";
        var person = new persona( a, "Jalan");

        System.out.println(person.getName());
    }
}

class persona {
    String Name ;
    String Address;

    public String getName(){
        return Name;
    }

    persona(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
        System.out.println("I am a person");
    }
}
