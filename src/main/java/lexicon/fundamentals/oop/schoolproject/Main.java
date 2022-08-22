package lexicon.fundamentals.oop.schoolproject;

import lexicon.fundamentals.oop.schoolproject.Data_Access.CourseDAOList;
import lexicon.fundamentals.oop.schoolproject.Data_Access.StudentDAOList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void choices(){
        System.out.println("Choose 1. For Operation Student  to create and insert into List");
        System.out.println("Choose 2 for operation to find student by Student Id");
        System.out.println("Choose 3 for operation to find student by Student Name ");
        System.out.println("Choose 4 for operation to find student by Student Email");
        System.out.println("Choose 5 for operation to find all Students");
        System.out.println("Choose 6 for operation to delete Student by Id");
        System.out.println("Choose 7 for operation Course to create and insert into List");
        System.out.println("Choose 8 for operation course to find course by Course Id");
        System.out.println("Choose 9 for operation course to find course by Course Name");
        System.out.println("Choose 10 for operation course to find course by Course Start Date");
        System.out.println("Choose 11 for operation course to fina all courses");
        System.out.println("Choose 12 for operation course to delete course by course object named with coursename");

    }
    public static void main(String[] args) {
       /**
       Student anusha=new Student(1,"Anusha Yenugu","anusha@gmail.com","Jönköping");
       Student harika=new Student(2,"Harika Yenugu","harika@gmail.com","Hyderabad");
       List<Student> addingStudents=new ArrayList<>();
       addingStudents.add(anusha);
       addingStudents.add(harika);

        LocalDate courseStartdate=LocalDate.parse("2020-08-31");
        Course java=new Course(21,"Java Full Stack",courseStartdate,40,addingStudents);

        java.register(anusha);
        java.register(harika);
        java.unregister(harika);

        StudentDAOList studentDAOList=new StudentDAOList();
        studentDAOList.saveStudent(anusha);
        studentDAOList.saveStudent(harika);
        System.out.println(studentDAOList.findById(1));


        CourseDAOList courseDAOList=new CourseDAOList();
        courseDAOList.saveCourse(java);
        System.out.println(courseDAOList.findById(21));
        System.out.println(courseDAOList.findByName("Java Full Stack"));
        System.out.println(courseDAOList.findAll());
        System.out.println(courseDAOList.findByDate(courseStartdate));
        System.out.println(courseDAOList.removeCourse(java));
        System.out.println(courseDAOList.findAll());

*/


        CommandLineInterfaceClass commandLineInterfaceClass=new CommandLineInterfaceClass();
        choices();
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        boolean loop=true;
        while(loop){
        switch (number){
            case 1: commandLineInterfaceClass.inputStudentFromConsole();
                    commandLineInterfaceClass.createStudentObject();
                    commandLineInterfaceClass.addStudentToList();
                    break;
            case 2: commandLineInterfaceClass.findStudentInformationById();
                    break;
            case 3: commandLineInterfaceClass.findStudentByName();
                    break;
            case 4: commandLineInterfaceClass.findByStudentEmail();
                    break;
            case 5: commandLineInterfaceClass.findAllStudents();
                    break;
            case 6: commandLineInterfaceClass.deleteStudentById();
                    break;
            case 7: commandLineInterfaceClass.inputConsoleCourse();
                    commandLineInterfaceClass.createCourseObject();
                    commandLineInterfaceClass.saveCourseIntoList();
                    break;
            case 8: commandLineInterfaceClass.findCourseById();
                    break;
            case 9: commandLineInterfaceClass.findCourseByName();
                    break;
            case 10: commandLineInterfaceClass.findCourseByStartDate();
                     break;
            case 11: commandLineInterfaceClass.findAllCourses();
                     break;
            case 12: commandLineInterfaceClass.deleteCourseById();
                    break;


        }
            System.out.println("Choose Yes to continue");
            String choice=scanner.next();
            if(choice.equals("y")){
                loop=true;
                choices();
                number= scanner.nextInt();
            }
            else {
                loop=false;
            }
      }
    }
}