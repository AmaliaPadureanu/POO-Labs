package lab8;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int id;
    private double averageGrade;
    private LinkedList<String> subjects = new LinkedList<>();

    public Student(String name, String surname, int id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }


    @Override
    public int compareTo(Student o) {
        int averageComparison = Double.compare(this.averageGrade, o.averageGrade);
        int surnameComaprison = surname.compareTo(o.surname);

        Long.compare(this.getId(), o.getId());
        if (averageComparison != 0) {
            return averageComparison;
            };
        if (surnameComaprison != 0) {
            return surnameComaprison;
            };
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Double.compare(student.getAverageGrade(), getAverageGrade()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getSurname(), student.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getId(), getAverageGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Robert", "Davidescu", 23, 9.98);
        Student s2 = new Student("Andreea", "Popescu", 86, 9.98);
        Student s3 = new Student("Alex", "Popescu", 79, 8.45);
        Student s4 = new Student("Maria", "Ivan", 9, 7.77);
        Student s5 = new Student("Diana", "Dumitrescu", 200, 10.0);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        System.out.print(s1);

        /*Collections.sort(students);
        students.forEach(System.out::println);
        students.sort((o1, o2) -> Double.compare(o2.getAverageGrade(), o1.getAverageGrade()));
        System.out.println();
        students.forEach(System.out::println);


        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        priorityQueue.addAll(students);
        while (!priorityQueue.isEmpty()) {
            Student s = priorityQueue.poll();
            System.out.print(s + "\n");
        }


       // students.forEach(System.out::println);

        LinkedList ll = new LinkedList<String>();
        ll.add("Math");
        ll.add("History");
        ll.add("Science");

        HashMap<Student, LinkedList<String>> studentSubjects = new HashMap<>();
        studentSubjects.put(s1, ll);

        for(Map.Entry<Student, LinkedList<String>> entry : studentSubjects.entrySet()){
            System.out.print(entry.getKey() + " studies " + entry.getValue());
        }

         */


    }


}
