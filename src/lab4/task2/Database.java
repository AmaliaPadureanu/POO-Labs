package lab4.task2;
import java.util.*;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    private static Database instance = null;
    public static int count;

    private Database(){}

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
            count++;
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        return count;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachersBySubject = new ArrayList<>();
        for(Teacher teacher : teachers) {
            for(int i = 0; i < teacher.getSubjects().size(); i++) {
                if(teacher.getSubjects().get(i).equals(subject)) {
                    teachersBySubject.add(teacher);
                }
            }
        }
        return teachersBySubject;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsBySubject = new ArrayList<>();
            for (Student stu : students) {
            Collection keys = stu.getSubjects().keySet();
                if(keys.contains(subject)) {
                studentsBySubject.add(stu);
           }
        }
        return studentsBySubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        Collections.sort(students);
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> byGrade = new ArrayList<>();
        for(Student stu : students) {
            Collection keys = stu.getSubjects().keySet();
            if (keys.contains(subject)) {
               byGrade.add(stu);
            }
        }
        byGrade.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSubjects().get(subject).compareTo(o2.getSubjects().get(subject));
            }
        });
        return byGrade;
    }
}
