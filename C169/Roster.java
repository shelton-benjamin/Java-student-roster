import java.util.ArrayList;


public class Roster
{
    private static ArrayList<Student> studentRoster = new ArrayList<Student>();
    
    public static void add(String studentId, String firstName, String lastName, 
                            String email, int age, int grade1, int grade2, int grade3)
    {
        Student newStudent = new Student(studentId, firstName, lastName, 
        email, age, grade1, grade2, grade3);
        
        studentRoster.add(newStudent);
    }
    public static void remove(String studentID)
    {
        boolean removed = false;
        String found = "Student " + studentID + " has been removed.";
        String notFound = "Student " + studentID + " could not be found.";
        for (int i = 0; i < studentRoster.size(); i++)
        {
            if(studentRoster.get(i).getStudentId().equals(studentID))
            {
                studentRoster.remove(i);
                removed = true;
                System.out.println(found);
            }
        }
       
        if (!removed)
        {
            System.out.println(notFound);
        }
    }
    public static void print_all()
    {
        for (Student eachStudent : studentRoster)
        {
            eachStudent.print();
        }
        
    }
    public static void print_average_grade(String studentID)
    {
        for (Student eachStudent : studentRoster)
        {
            if(eachStudent.getStudentId().equals(studentID))
            {
                int gradeSum = eachStudent.getGrade1() + eachStudent.getGrade2() + eachStudent.getGrade3();    
                int gradeAverage = gradeSum / 3;
                System.out.println("The average grade for student " + studentID + " is " + gradeAverage);
            }
        }
    }
    public static void print_invalid_emails()
    {
        String invalidEmail = "Invalid email address: ";
        String noInvalidEmail = "There are no invalid email addresses.";
        boolean invalid = false;
        for(Student eachStudent : studentRoster)
        {
            
            String emails = eachStudent.getEmail();
            if (!emails.contains("@") 
                || !emails.contains(".")
                || emails.contains(" "))
                {
                    System.out.println(invalidEmail + emails);
                    invalid = true;
                }
        }
        if (!invalid)
        {
            System.out.println(noInvalidEmail);
        }
        
    }
    public static void main(String[] args)
    {
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
             "5,Benjamin,Shelton,bshel12@my.wgu.edu,26,98,94,78"};
             
             
             
           for(int i = 0; i < students.length; i++)
            {
                String eachStudent = students[i];
                String[] element = eachStudent.split(",");
                String studentId = element[0];
                String firstName = element[1];
                String lastName = element[2];
                String email = element[3];
                int age = Integer.parseInt(element[4]);
                int grade1 = Integer.parseInt(element[5]);
                int grade2 = Integer.parseInt(element[6]);
                int grade3 = Integer.parseInt(element[7]);
                add(studentId, firstName, lastName,
                email, age, grade1, grade2, grade3);
            }
             print_all();
             print_invalid_emails();
             
             
             //loop through the ArrayList and for each element:
           for (Student eachStudent : studentRoster)
           {
               String print = eachStudent.getStudentId().toString();
               print_average_grade(print);
            }
             
             remove("3");
             remove("3");
             //expected: this should print a message saying such a student with this ID was not found.
    }
}

























