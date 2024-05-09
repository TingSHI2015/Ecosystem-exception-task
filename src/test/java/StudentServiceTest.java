import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFindById_addNewStudentWithoutIDThenThrowException() {
        //GIVEN
        StudentService service = new StudentService();
        Student student1 = Student.builder()
                .name("Ting")
                .subject("Java")
                .build();

        //WHEN
        Exception exception = assertThrows(NoSuchElementException.class,()-> service.findById(student1.id()));

        String actualMessage = exception.getMessage();


        //THEN
        String expectMessage = "No Student found with ID: " + student1.id();
        assertEquals(expectMessage,actualMessage);
    }


}