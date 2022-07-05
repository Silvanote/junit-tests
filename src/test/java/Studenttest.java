public class Studenttest{
    private Student student;

    @Before
    public void setUp(){
        this.student = new Student(1, "Juan Silva");
    }
    @Test
    public void testStudentConstructor(){

    }
}