import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.Student;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Anna Laryushkina");
    }

    @Test
    @DisplayName("Добавление корректных оценок")
    void testAddCorrectGrade() {
        student.addGrade(5);
        assertEquals(1, student.getGrades().size());
        assertEquals(List.of(5), student.getGrades());

        student.addGrade(2);
        assertEquals(2, student.getGrades().size());
        assertEquals(List.of(5, 2), student.getGrades());
    }

    @Test
    @DisplayName("Добавление невалидных оценок")
    void testAddGradeInvalid() {
        assertThrows(IllegalArgumentException.class, () -> student.addGrade(6), "6 is wrong grade");
        assertThrows(IllegalArgumentException.class, () -> student.addGrade(1), "1 is wrong grade");
    }

    @Test
    @DisplayName("Неизменяемость списка оценок")
    void testGetGradesImmutable() {
        student.addGrade(4);
        List<Integer> grades = student.getGrades();

        assertThrows(UnsupportedOperationException.class, () -> grades.clear(), "Should not allow modification");
    }

    @Test
    @DisplayName("Проверка Equals и HashCode")
    void testEqualsAndHashCode() {
        Student anotherStudent = new Student("Anna Laryushkina");
        anotherStudent.addGrade(5);
        student.addGrade(5);

        assertEquals(student, anotherStudent);
        assertEquals(student.hashCode(), anotherStudent.hashCode());

        anotherStudent.setName("Inna Laryushkina");
        assertNotEquals(student, anotherStudent);
    }

    @Test
    @DisplayName("Проверка ToString")
    void testToString() {
        student.addGrade(4);
        assertEquals("Student{name=Anna Laryushkina, marks=[4]}", student.toString());
    }

}

