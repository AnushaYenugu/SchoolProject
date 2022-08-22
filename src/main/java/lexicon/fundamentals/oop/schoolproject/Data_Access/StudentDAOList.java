package lexicon.fundamentals.oop.schoolproject.Data_Access;

import lexicon.fundamentals.oop.schoolproject.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentDAOList implements StudentDAO{
    List<Student> students=new ArrayList<>();
    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        for (Student student:students) {
            if(student.getEmail().equals(email)){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        for (Student student:students) {
            if(student.getName().equals(name)){
                return Collections.singletonList(student);
            }

        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteStudent(Student student) {
          Iterator<Student> deleteStudents=students.iterator();
            while(deleteStudents.hasNext()){
               if( deleteStudents.next().getId()==student.getId()){
                   deleteStudents.remove();
                   return true;
               }
            }
        return false;
    }


}
