import java.util.ArrayList;


public class Student
{
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    int[] grades = new int[3];
   
    public Student(String studentId, String firstName, String lastName, 
    String email, int age, int grade1, int grade2, int grade3)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
    }
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }
    public String getStudentId()
    {
        return studentId;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setGrade1(int grade1)
    {
        grades[0] = grade1;
    }
    public int getGrade1()
    {
        return grades[0];
    }
    public void setGrade2(int grade2)
    {
        grades[1] = grade2;
    }
    public int getGrade2()
    {
        return grades[1];
    }    
    public void setGrade3(int grade3)
    {
        grades[2] = grade3;
    }
    public int getGrade3()
    {
        return grades[2];
    }
    public void print()
    {           
        System.out.println("Student ID: " + getStudentId() + "\tFirst Name: " + getFirstName() +
        "\tLast Name: " + getLastName() + "\tEmail: " + getEmail() + "\tAge: " + getAge() +      
        "\tGrades: {" + getGrade1() + "," + getGrade2() + "," + getGrade3() +"}");        
    }
}






















