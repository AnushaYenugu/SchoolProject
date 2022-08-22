package lexicon.fundamentals.oop.schoolproject.Data_Access;

import lexicon.fundamentals.oop.schoolproject.Course;

import java.time.LocalDate;
import java.util.*;

public class CourseDAOList implements CourseDAO{
    List<Course> courses=new ArrayList<>();
    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        for (Course courseById:courses) {
            if(courseById.getCourseId()==id){
                return courseById;
            }

        }
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        List<Course> findByNames=new ArrayList<>();
        for (Course course:courses) {
            if(course.getCourseName().equals(name)){
                findByNames.add(course);
            }

        }
        return findByNames;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        List<Course> findByDates=new ArrayList<>();
        for (Course course:courses) {
            if (course.getStartDate().equals(date)){
                findByDates.add(course);
            }
        }
        return findByDates;
    }

    @Override
    public List<Course> findAll() {

        return courses;
    }

    @Override
    public boolean removeCourse(Course course) {
       Iterator<Course> removeCourse=courses.iterator();
        while(removeCourse.hasNext()){
            if(removeCourse.next().getCourseName().equals(course.getCourseName())){
                removeCourse.remove();
                return true;
            }
        }
        return false;
    }
}
