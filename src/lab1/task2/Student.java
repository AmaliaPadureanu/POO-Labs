package lab1.task2;

public class Student {
    private String name;
    private Integer year;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getYear() {
        return year;
    }

    void setYear(Integer year) {
        this.year = year;
    }

     @Override
  public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
