package lexicon.fundamentals.oop.schoolproject.Data_Access;

import lexicon.fundamentals.oop.schoolproject.Course;
import lexicon.fundamentals.oop.schoolproject.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseDAOListTest {
    private CourseDAOList courseDAOListTest;
    private StudentDAOList studentDAOListTest;

    @BeforeEach
    void setup(){
        courseDAOListTest=new CourseDAOList();
        studentDAOListTest=new StudentDAOList();
    }

    public void setUpCourse(){
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
        LocalDate courseStartDate=LocalDate.parse("2022-08-31");
        Course java =new Course(21,"Java Full Stack",courseStartDate,40,studentDAOListTest.students);
         courseDAOListTest.saveCourse(java);
    }

    @Test
    void saveCourse() {
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
        LocalDate courseStartDate=LocalDate.parse("2020-08-31");
        Course java =new Course(21,"Java Full Stack",courseStartDate,40,studentDAOListTest.students);
        courseDAOListTest.saveCourse(java);
        assertEquals(courseDAOListTest.courses.size(),1);
    }

    @Test
    void findById() {
        setUpCourse();
        Course result= courseDAOListTest.findById(21);
        assertEquals(result.getCourseId(),21);

    }

    @Test
    void findByName() {
        setUpCourse();
        List<Course> result=courseDAOListTest.findByName("Java Full Stack");
        assertEquals(result.size(),1);
        assertEquals(courseDAOListTest.courses.get(0).getCourseName(),"Java Full Stack");
    }


    @Test
    void findByDate() {
        setUpCourse();
        LocalDate courseStartDate=LocalDate.parse("2022-08-31");
        LocalDate date=LocalDate.parse("2022-08-31");
        List<Course> result=courseDAOListTest.findByDate(date);
        assertEquals(1,result.size());
        assertEquals(courseDAOListTest.courses.get(0).getStartDate(),courseStartDate);
    }

    @Test
    void findAll() {
        setUpCourse();
        List<Course> result=courseDAOListTest.findAll();
        assertEquals(1,result.size());
        assertEquals(21,courseDAOListTest.courses.get(0).getCourseId());

    }

    @Test
    void removeCourse() {
        setUpCourse();
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        studentDAOListTest.saveStudent(anusha);
        LocalDate courseStartDate=LocalDate.parse("2022-08-31");
        Course java =new Course(21,"Java Full Stack",courseStartDate,40,studentDAOListTest.students);

        boolean result=courseDAOListTest.removeCourse(java);
        assertEquals(0,courseDAOListTest.courses.size());
        assertTrue(result);
    }
}