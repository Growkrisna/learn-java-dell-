public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void Hello(String paraName){
        System.out.println("Hello " + paraName + ", My name is " + name);
    }
}
