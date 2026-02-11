public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    Role(){
        System.out.println("I am a person");
    }

    Person(String paramName){
        name = paramName;   

    }

    void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + name);
    }
}
