public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;

    }

    void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + name);
    }
}
