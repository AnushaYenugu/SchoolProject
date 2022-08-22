package lexicon.fundamentals.oop.schoolproject.Data_Access;

import lexicon.fundamentals.oop.schoolproject.Student;

import java.util.List;

public interface StudentDAO {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    List<Student> findByName(String name);
    Student findById(int id);
    List<Student> findAll();
    boolean deleteStudent(Student student);
}
