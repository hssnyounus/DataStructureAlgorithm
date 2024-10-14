package oops;

public class Student {

  int stId;
  String studentName;
  String studendClass;

  public Student(String studentName) {
    this.studentName = studentName;
  }

  public Student() {

  }

  public void getDetail () {
    System.out.println(stId+ " student Id");
    System.out.println(studentName+ " student name");
    System.out.println(studendClass+ " student class");
  }

}
