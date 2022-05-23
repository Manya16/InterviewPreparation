import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(new Person(25, "ajay"),
                new Person(27, "manya"),
                new Person(23, "payal"),
                new Person(27, "abhey")));

        System.out.println(Arrays.asList(personList));
        Collections.sort(personList);
        System.out.println(Arrays.asList(personList));
    }
}

class Person implements Comparable<Person> {

    Integer age;
    String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return o.age-this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
