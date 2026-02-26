package School;
import java.util.jar.Attributes.Name;

public class oop2 {
    public static void main(String[] args) {
        cPersona p = new student("Roselia");
        student student = new student("Nisaan");
        teacher teacher = new teacher("Ayla");
        student s = (student) p;s.study();
        // student.Hello("Yudi");
        // p.Hello("Wakaba");
        // teacher.Hello("Yudi");

        System.out.println("-----------------------------");
        System.out.println("Data Persona student");
        student.editStudent("Nighurt", "Tokyo", "Japan");
        System.out.println(student.toString());
        
    }
}