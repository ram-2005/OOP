class Person
{
  String name;
  String dateOfBirth;

  Person(String name, String dateOfBirth)
  {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

  void displayInfo()
  {
    System.out.println("Name :"+ name);
    System.out.println("Date of Birth:"+ dateOfBirth);
  }
}



class Teacher extends Person
{
  double salary;
  String subject;

  Teacher(String name, String dateOfBirth, double salary, String subject)
  {
    super(name, dateOfBirth);
    this.salary = salary;
    this.subject = subject;
  }

  @Override
  void displayInfo()
  {
    super.displayInfo();
    System.out.println("salary :"+ salary);
    System.out.println("subject :"+ subject);
  }
}


class student extends Person
{
  String studentID;

  student(String name, String dateOfBirth, String studentID)
  {
    super(name, dateOfBirth);
    this.studentID = studentID;
  }

  @Override
  void displayInfo()
  {
    super.displayInfo();
    System.out.println("Student ID :"+ studentID);
  }
}




class CollegeStudent extends student
{
  String collegeName;
  String year;

  CollegeStudent(String name, String dateOfBirth, String studentID, String collegeName, String year)
  {
    super(name, dateOfBirth, studentID);
    this.collegeName = collegeName;
    this.year = year;
  }

  @Override
  void displayInfo()
  {
    super.displayInfo();
    System.out.println("College Name :"+ collegeName);
    System.out.println("Year :"+ year);
  }
}



public class program1
{
  public static void main(String[] args)
  {

    System.out.println("-------------Person Detials----------------");
    Person p = new Person("Alex", "23-12-1923");
    p.displayInfo();

    System.out.println("-------------Teacher Detials----------------");
    Teacher t = new Teacher("Dr.Oppenheimer", "31-06-1947", 55000, "Nuclear Physics");
    t.displayInfo();

    System.out.println("-------------Student Detials----------------");
    student st = new student("Max Verstappen", "01-01-1998", "Stu-1243");
    st.displayInfo();

    System.out.println("-------------College Student Detials----------------");
    CollegeStudent cs = new CollegeStudent("Bruce Wayne", "25-05-2005", "CST045", "MSAJCE", "Third Year");
    cs.displayInfo();
  }
}
