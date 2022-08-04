package lab4.task2;

import java.util.*;

public class Student implements Comparable {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Student(Student otherStudent) {
        this.firstName = new String(otherStudent.firstName);
        this.lastName = new String(otherStudent.lastName);
        this.subjects = new HashMap<>(otherStudent.subjects);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double average = 0;
        int count = 0;
        for(double grade : getSubjects().values()) {
            average += grade;
            count++;
        }
        average = average/count;
        return average;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> list = Database.getDatabase().findAllTeachers();
        ArrayList<Teacher> deepCopy = new ArrayList<>();
        for(Teacher t : list) {
            deepCopy.add(new Teacher(t.getFirstName(), t.getLastName(), t.getSubjects()));
        }
        List<Teacher> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    public int getGradeForSubject(String subject) {
        int gradeForSubject = subjects.get(subject);
        return gradeForSubject;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        List<Teacher> list = Database.getDatabase().findTeachersBySubject(subject);
        ArrayList<Teacher> deepCopy = new ArrayList<>();
        for(Teacher t : list) {
            deepCopy.add(new Teacher(t.getFirstName(), t.getLastName(), t.getSubjects()));
        }
        List<Teacher> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    public List<Student> getAllStudents() {
        List<Student> list = Database.getDatabase().findAllStudents();
        ArrayList<Student> deepCopy = new ArrayList<>();
        for(Student s : list) {
            deepCopy.add(new Student(s.getFirstName(), s.getLastName(), s.getSubjects()));
        }
        List<Student> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> list = Database.getDatabase().getStudentsBySubject(subject);
        ArrayList<Student> deepCopy = new ArrayList<>();
        for(Student s : list) {
            deepCopy.add(new Student(s.getFirstName(), s.getLastName(), s.getSubjects()));
        }
        List<Student> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> list = Database.getDatabase().getStudentsByAverageGrade();
        ArrayList<Student> deepCopy = new ArrayList<>();
        for(Student s : list) {
            deepCopy.add(new Student(s.getFirstName(), s.getLastName(), s.getSubjects()));
        }
        List<Student> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> list = Database.getDatabase().getStudentsByGradeForSubject(subject);
        ArrayList<Student> deepCopy = new ArrayList<>();
        for(Student s : list) {
            deepCopy.add(new Student(s.getFirstName(), s.getLastName(), s.getSubjects()));
        }
        List<Student> deepCopy1 = Collections.unmodifiableList(deepCopy);
        return deepCopy1;
    }

    @Override
    public int compareTo(Object otherStudent) {
        double compareAverage = ((Student) otherStudent).averageGrade();
        return (int) (this.averageGrade() - compareAverage);

    }

}
