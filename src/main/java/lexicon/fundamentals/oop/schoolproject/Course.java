package lexicon.fundamentals.oop.schoolproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students=new ArrayList<>();




    public Course(int courseId, String courseName, LocalDate startDate, int weekDuration, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = students;
    }

    public int getCourseId() {

        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> student) {
        this.students = student;
    }

    public void register(Student student){


        students.add(student);
    }

    public void unregister(Student student){


        students.remove(student);
    }

    public String toString(){
        return getCourseId()+" "+getCourseName()+" "+getStartDate()+" "+getWeekDuration()+" "+getStudent();
    }
}
