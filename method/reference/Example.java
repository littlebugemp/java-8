package method.reference;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person p = new Person();
        p.setId(1);
        p.setName("Test");
        people.add(p);
        people.forEach(s-> System.out.println(s.getName()));
        people.forEach(System.out::println);
        people.stream().map(x->x.getName()).forEach(System.out::println);
    }
}
