package subject;

import java.util.Set;
import student.Student;
import lecturer.Lecturer;

public class Subject {
    private String id;
    private String name;
    private SubjectType subjectType;
    private Set<Student> students;
    private Set<Lecturer> lecturers;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Lecturer> getLecturers() {
        return lecturers;
    }

    public void addNewStudents(Student student){
        this.students.add(student);
    }

    public void addNewLecturers(Lecturer lecturer){
        this.lecturers.add(lecturer);
    }

}
