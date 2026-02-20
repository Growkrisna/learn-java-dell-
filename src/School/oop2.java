package School;
import java.util.jar.Attributes.Name;

public class oop2 {
    public static void main(String[] args) {
        student student = new student("Nisaan");
        persona p = new student("Roselia");
        teacher teacher = new teacher("Ayla");
        student s = (student) p;s.study();
        student.Hello("Yudi");
        p.Hello("Wakaba");
        teacher.Hello("Yudi");
        
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

    public void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + Name);
    }

}

class student extends persona {
    public student (String name){
        super(name, "Unknown", "Indonesia");
    }
    public void study(){
        System.out.println(this.getName() + " is studying");
    }

    @Override
    public  void Hello(String paraName){
        System.out.println("Holla " + paraName + ", just call me " + this.getName());
    }
}

class teacher extends persona {
    public teacher (String name){
        super(name, "Unknown", "Indonesia");
    }

    @Override
    public  void Hello(String paraName){
        System.out.println("Holla " + paraName + ", just call me " + this.getName());
    }
}
