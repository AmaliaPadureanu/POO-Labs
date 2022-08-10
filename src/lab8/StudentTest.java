package lab8;

import org.junit.jupiter.api.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        this.student = new Student("Andrei", "Popescu", 632, 8.35);
    }

    @AfterEach
    public void clean() {
        this.student = null;
    }

    @Test
    @DisplayName("Equality test")
    public void testEquality() {
        Assertions.assertEquals(true, student.equals(new Student("Andrei", "Popescu", 632, 8.35)));
        Assertions.assertNotEquals(true, student.equals(new Student("Robert", "Davidescu", 3925, 9.62)));
    }


    @Test
    @DisplayName("To string test")
    public void testToString() {
        Assertions.assertEquals("Student{name='Andrei', surname='Popescu', id=632, averageGrade=8.35}", student.toString());
        Assertions.assertNotEquals("Student{name='Robert', surname='Davidescu', id=23, averageGrade=9.98}", student.toString());
    }

}
