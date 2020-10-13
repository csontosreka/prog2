import java.io.IOException;
import java.util.Objects;

public class Student {
    public String name;
    public int age;
    public String id;
    public String email = "Hello!";
    public boolean sent = true;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
        this.sent = sent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(id, student.id);
    }

    public Student clone() {
        return new Student(this.name, this.age, this.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public void finalize(){
        System.out.println(String.format("Something happened"));
    }

    public static void main(String[] args) {
        Student jani = new Student("jani", 19, "ABC123");
        Student jozsi = new Student("jozsi", 21, "ABC231");

        System.out.println("getClass():  " + jani.getClass());

        System.out.println("equals():");
        if (jani.equals(jozsi)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        System.out.println("hashCode(): " + jozsi.hashCode());

        Student jozsi2 = jozsi.clone();
        System.out.println("clone(): " + jozsi2);

        System.out.println("toString(): " + jozsi.toString());

        jozsi.finalize();
    }
}