public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Person(){
        System.out.println("I am a person");
    }

    Person(String paramName){
        this(paramName, "Unknown");
    }

    void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + name);
    }

    public void Role() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Role'");
    }

    void helloworld(String name){
        System.out.println("Hello World " + name + "My name is " + this.name);
    }
}

class viceppl extends Person {

    public static void main(String[] args) {   
        var viceppl = new viceppl();
        viceppl.name = "Krisna";
        viceppl.Hello("Krisna");
    }
}