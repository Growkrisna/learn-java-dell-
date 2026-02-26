package School;
import java.util.jar.Attributes.Name;

public class oop2 {
    public static void main(String[] args) {
        student student = new student("Nisaan");
        cPersona p = new student("Roselia");
        teacher teacher = new teacher("Ayla");
        student s = (student) p;s.study();
        student.Hello("Yudi");
        p.Hello("Wakaba");
        teacher.Hello("Yudi");
        
    }
}