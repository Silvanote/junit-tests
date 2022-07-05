import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Studenttest{
    private Student student;

    @Before
    public void setUp(){
        this.student = new Student(1, "Juan Silva");
    }
    @Test
    public void testStudentConstructor(){
        assertEquals(1, stud.getID());
        assertEquals("Juan Silva", student.getName());
    assertTrue(student.getGrades().isEmpty());
    }
    //INSTRUCTOR'S EXAMPLE TO TEST CODE //

//    @Test
//    public void testID(){
//        assertEquals(1, student.ID());
//        Student newStudent = new Student(24, "Another Person")
//                assertEquals(24,newStudent.ID())
//    }
//    @Test
//    public void tester(){
//        assertEquals(1, student.ID());
//        Student newStudent = new Student(24, "Another Person")
//                assertEquals(24,newStudent.ID())
}