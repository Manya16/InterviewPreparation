import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(Arrays.asList(new Student(25, "ajay"),
                new Student(27, "manya"),
                new Student(23, "payal"),
                new Student(27, "abhey")));

        System.out.println(Arrays.asList(students));
        Collections.sort(students, new ageComparator());
        System.out.println(Arrays.asList(students));
    }
}

class Student {
    Integer age;
    String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class ageComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.age - o1.age;
    }
}
