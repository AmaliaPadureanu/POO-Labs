package lab1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String title;
    private String description;
    Student[] students = new Student[5];

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


    public List<Student> filterYear(int year, Student[] students) {
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
