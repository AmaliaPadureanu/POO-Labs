package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }

    String getDescription() {
        return description;
    }
    void setDescription(String description) {
        this.description = description;
    }

    Student[] getStudents() {return students;}
    void setStudents(Student[] students) {
        this.students = students;
    }

    public List<Student> filterYear(int year) {
        List<Student> studentsInYear = new ArrayList<>();
        this.students = students;
        for(int i = 0; i < students.length; i++) {
            if(students[i].getYear() == year) {
                studentsInYear.add(students[i]);
            }
        }
        System.out.println(studentsInYear);
        return studentsInYear;
    }
}
