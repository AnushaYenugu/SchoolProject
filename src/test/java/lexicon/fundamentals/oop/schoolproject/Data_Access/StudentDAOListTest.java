package lexicon.fundamentals.oop.schoolproject.Data_Access;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import lexicon.fundamentals.oop.schoolproject.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOListTest {
    private StudentDAOList studentDAOListTest;

    private static final String STUDENT_NAME = "Anusha Yenugu";

    public void setUpStudent(){
        Student anusha=new Student(1,STUDENT_NAME,"anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
    }

    @BeforeEach
    void setup(){
        studentDAOListTest=new StudentDAOList();

    }

    @Test
    void saveStudent() {
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
        assertEquals(studentDAOListTest.students.size(),1);

    }

    /**
     * Want to  find students  with their email id,
     * and to test it returns the same or not
     * Given
     * Should have existing student information with email id: anusha@gmail.com in the List at StudentDAOList class
     * When
     * if email anusha@gmail.com matches with student in the List at StudentDAO class, then return that particular
     * student object
     *
     * Then
     * The result of student object values should be same as given student values/members
     */
    @Test
    void testThatWhenAStudentExistWithEmailIdFindByEmailIdShouldReturnThatStudent() {
        // Given
        setUpStudent();

        // When
        Student result=studentDAOListTest.findByEmail("anusha@gmail.com");

        // Then
        assertEquals(STUDENT_NAME, result.getName());
        assertEquals("anusha@gmail.com", result.getEmail());
        assertEquals(1, result.getId());
    }

    /**
     * Should find student information by name
     * Given
     * should exist Student information Student with name: Anusha Yenugu in the List at StudentDAOList class
     *
     * When
     * findByName() method of StudentDAOList class is called then with name:"Anusha Yenugu"
     * then its matches it should return that particular student object
     *
     * Then
     * we shall compare with its anusha object values with created anusha values.
     */
    @Test
    void findByName() {
        setUpStudent();
        //List<Student> findByNames=new ArrayList<>();
        List<Student>result=studentDAOListTest.findByName("Anusha Yenugu");
        assertEquals(result.size(),1);
        assertEquals(result.get(0).getName(),"Anusha Yenugu");
        assertEquals(result.get(0).getId(),1);
    }

    @Test
    void findById() {
        setUpStudent();
      Student result=  studentDAOListTest.findById(1);
        assertEquals(result.getId(),1);
    }

    @Test
    void findAll() {
        setUpStudent();
        List<Student> result=studentDAOListTest.findAll();
        assertEquals(result.size(),1);

    }


    @Test
    void deleteStudent() {
       // setUpStudent();
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
        boolean result= studentDAOListTest.deleteStudent(anusha);
        assertTrue(result);
    }
}