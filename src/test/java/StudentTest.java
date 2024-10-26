import org.mockito.Mockito;
import org.example.GradeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.Student;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;
    private GradeService gradeService;

    @BeforeEach
    void setUp() {
        gradeService = Mockito.mock(GradeService.class);
        student = new Student("Anna Laryushkina",gradeService);
    }

    @Test
    @DisplayName("Добавление корректных оценок")
    void testAddCorrectGrade() {
        Mockito.when(gradeService.checkGrade(5)).thenReturn(true);
        Mockito.when(gradeService.checkGrade(2)).thenReturn(true);

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
        Mockito.when(gradeService.checkGrade(6)).thenReturn(false);
        Mockito.when(gradeService.checkGrade(1)).thenReturn(false);

        assertThrows(IllegalArgumentException.class, () -> student.addGrade(6), "6 is wrong grade");
        assertThrows(IllegalArgumentException.class, () -> student.addGrade(1), "1 is wrong grade");
    }

    @Test
    @DisplayName("Неизменяемость списка оценок")
    void testGetGradesImmutable() {
        Mockito.when(gradeService.checkGrade(4)).thenReturn(true);
        student.addGrade(4);

        var grades = student.getGrades();
        assertThrows(UnsupportedOperationException.class, () -> grades.clear(), "Should not allow modification");
    }

    @Test
    @DisplayName("Проверка Equals и HashCode")
    void testEqualsAndHashCode() {
        Mockito.when(gradeService.checkGrade(5)).thenReturn(true);
        Student anotherStudent = new Student("Anna Laryushkina",gradeService);
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
        Mockito.when(gradeService.checkGrade(4)).thenReturn(true);
        student.addGrade(4);
        assertEquals("Student{name=Anna Laryushkina, marks=[4]}", student.toString());
    }

}

