public class oop {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();

        Person person3;
        person3 = new Person();

        person1.name = "Krisna";
        person1.address = "Jl. Jalan No. 67";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.Hello("Yudi");
        person2.Hello(null);
    }
}
