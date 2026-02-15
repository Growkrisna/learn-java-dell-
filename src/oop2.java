import java.util.jar.Attributes.Name;

public class oop2 {
    public static void main(String[] args) {
        String a = "Roselia";
        var person = new persona( a, "Jawa", "Indonesia");
        student student = new student(a);
        student.study();
        // System.out.println(person.getName());
    }
}

class persona {
    private String Name ;
    private String Address;
    private String country;

    public String getName(){
        return Name;
    }

    persona(String Name, String Address, String country){
        this.Name = Name;
        this.Address = Address;
        this.country = country;
        // System.out.println("I am a person");
    }
}

class student extends persona {
    public student (String name){
        super(name, "Unknown", "Indonesia");
    }
    public void study(){
        System.out.println(this.getName() + " is studying");
    }
}
