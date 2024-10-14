package oops;

public class SchoolOffice{
  public static void main(String[] args) {
    String name = "adnan";
    Student student  = new Student();
//    student.stId = 12123213;
//    student.studentName = "shahwaiz";
//    student.studendClass = "9th";
    student.getDetail();

    Student student1 = new Student(name);
    student1.getDetail();
    User user = new User();

  }
}
