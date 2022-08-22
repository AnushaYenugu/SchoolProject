package lexicon.fundamentals.oop.schoolproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentConstructorTest(){
        Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
        assertEquals(anusha.getId(),1);
        assertEquals(anusha.getName(),"Anusha Yenugu");
        assertEquals(anusha.getEmail(),"anusha@gmail.com");
        assertEquals(anusha.getAddress(),"Jönköping");
    }

}