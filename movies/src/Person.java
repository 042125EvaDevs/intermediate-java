import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person extends Movies {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> getPersons() {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Ethan Hunt ", 59));
        people.add(new Person("Bryan Mills ", 67));
        people.add(new Person("Jason Bourne ", 54));
        people.add(new Person("James Bond ", 35));
        people.add(new Person("Robert McCall ", 69));
        people.add(new Person("John Wick ", 52));
        people.add(new Person("John McClane ", 70));
        people.add(new Person("Eric Brooks ", 70));
        return people;
    }

    public static List<Person> overFifty(List<Person> people) {
        return people.stream()
                .filter(person -> person.age > 50)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

