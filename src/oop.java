public class oop {
    public static void main(String[] args) {
        var person1 = new Person("Krisna", "Jl. Jalan No. 67");
        Person person2 = new Person("AKLAS", "JL. ASDKJ No. 89");

        person1.name = "Krisna";
        person1.address = "Jl. Jalan No. 67";


        person1.Role();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.Hello("Yudi");
        person2.Hello(null);
    }
}

class viceppl extends Person {

}
