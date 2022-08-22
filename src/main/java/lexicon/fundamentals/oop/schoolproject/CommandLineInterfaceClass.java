package lexicon.fundamentals.oop.schoolproject;

import jdk.nashorn.internal.parser.JSONParser;
import lexicon.fundamentals.oop.schoolproject.Data_Access.CourseDAOList;
import lexicon.fundamentals.oop.schoolproject.Data_Access.StudentDAOList;

import java.time.LocalDate;
import java.util.Scanner;

public class CommandLineInterfaceClass {
    private static int studentId;
    private static int courseId=20;


  //  public static void main(String[] args) {
        String studentFullName;
        String studentEmail;
        String studentAddress;
        Scanner scanner;
        Student student1;
        StudentDAOList studentDAOList=new StudentDAOList();



        CourseDAOList courseDAOList=new CourseDAOList();
        String courseName;
        LocalDate courseStartDate;
        int courseDuration;
        Student student;
        Course course1;


        public void inputStudentFromConsole()
        {
            System.out.println("Enter information of Student");
            scanner = new Scanner(System.in);
            System.out.println("Enter Student full name");
            studentFullName = scanner.nextLine();
            System.out.println("Enter Student email adress");
            studentEmail = scanner.nextLine();
            System.out.println("Enter Student Adress");
            studentAddress = scanner.nextLine();
            studentId=studentId+1;


        }
        public void createStudentObject(){
          // Object studentObject=studentFullName;
          //  student1=(Student) studentObject;
            student1=new Student(studentId, studentFullName,studentEmail,studentAddress);
        }
        public void addStudentToList(){
            studentDAOList.saveStudent(student1);
        }
        public void findStudentInformationById(){
            System.out.println("Enter Student Id: ");
            int findByStudentId= scanner.nextInt();
            System.out.println(studentDAOList.findById(findByStudentId));

        }

        public void findStudentByName(){
            System.out.println("Enter Student name: ");
            String findByStudentName=scanner.nextLine();
            System.out.println(studentDAOList.findByName(findByStudentName));
        }

        public void findByStudentEmail(){
            System.out.println("Enter Student email: ");
            String findByEmail=scanner.nextLine();
            System.out.println(studentDAOList.findByEmail(findByEmail));

        }
        public void deleteStudentById(){
            System.out.println("Enter Student name to delete Student");
            String deleteStudentString=scanner.nextLine();
            Object deleteStudentObject=deleteStudentString;
            Student deleteStudent=(Student) deleteStudentObject;
            System.out.println(studentDAOList.deleteStudent(deleteStudent));
        }

        public void findAllStudents(){
            System.out.println(studentDAOList.findAll());
        }
        public void inputConsoleCourse(){
            System.out.println("Enter Course information ");
            System.out.println("Enter Course name");
            courseName=scanner.nextLine();
            System.out.println("Enter Course Start Date with YYYY-MM-DD Format");
            String courseDate=scanner.nextLine();
            courseStartDate=LocalDate.parse(courseDate);
            System.out.println("Enter Duriation of Course");
            courseDuration=scanner.nextInt();
            student=studentDAOList.saveStudent(student1);
            courseId=courseId+1;

        }

        public void createCourseObject(){
           // Object courseObject=courseName;
           // course1=(Course) courseObject;
            course1=new Course(courseId,courseName,courseStartDate,courseDuration,studentDAOList.findAll());
        }
        public void saveCourseIntoList(){
            courseDAOList.saveCourse(course1);
        }
        public void findCourseById(){
            System.out.println("Enter Course Id: ");
            int findByIdCourse= scanner.nextInt();
            courseDAOList.findById(findByIdCourse);
        }
        public void findCourseByName(){
            System.out.println("Enter Course Name: ");
            String findByName=scanner.nextLine();
            courseDAOList.findByName(findByName);
        }
        public void findCourseByStartDate(){
            System.out.println("Enter Date in YYYY-MM-DD format");
            String courseDate=scanner.nextLine();
            LocalDate courseStartDate=LocalDate.parse(courseDate);
            courseDAOList.findByDate(courseStartDate);
        }

        public void findAllCourses(){
            System.out.println(courseDAOList.findAll());
        }

        public void deleteCourseById(){
            System.out.println("Enter course name to delete course");
            System.out.println(courseDAOList.removeCourse(course1));
        }





}
