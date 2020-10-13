package student;

import java.util.Set;
import subject.Subject;

public class Student {
    private String name;
    private String neptunId;
    private Set<Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public String getNeptunId() {
        return neptunId;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public void removeSubject(Subject subject){
        this.subjects.remove(subject);
    }

}
