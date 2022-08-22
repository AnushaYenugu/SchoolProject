package lexicon.fundamentals.oop.schoolproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @BeforeEach
    void setUp(){
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        Student harika=new Student(2,"Harika Yenugu","harika@gmail.com","India");
        List<Student> addingStudents=new ArrayList<>();
        addingStudents.add(anusha);
        addingStudents.add(harika);

    }

    @Test
    void courseConstructorTest(){
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        Student harika=new Student(2,"Harika Yenugu","harika@gmail.com","India");
        List<Student> addingStudents=new ArrayList<>();
        addingStudents.add(anusha);
        addingStudents.add(harika);
        LocalDate courseStartDate=LocalDate.parse("2022-08-31");
        Course java=new Course(21,"Java Full Stack",courseStartDate,40,addingStudents);
    }

    @Test
    void register() {
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        Student harika=new Student(2,"Harika Yenugu","harika@gmail.com","India");
        Collection<Student> addingStudentsToCourse=new ArrayList<>();
        addingStudentsToCourse.add(anusha);
        addingStudentsToCourse.add(harika);
        assertEquals(addingStudentsToCourse.size(),2);


    }

    @Test
    void unregister() {
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        Student harika=new Student(2,"Harika Yenugu","harika@gmail.com","India");
        Collection<Student> addingStudentsToCourse=new ArrayList<>();
        addingStudentsToCourse.add(anusha);
        addingStudentsToCourse.add(harika);
        assertEquals(addingStudentsToCourse.size(),2);
        addingStudentsToCourse.remove(anusha);
        assertEquals(addingStudentsToCourse.size(),1);

    }
}