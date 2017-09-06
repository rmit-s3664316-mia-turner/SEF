package JUnitTest;
public class Student extends User{
    
    private int studentNumber;
    private String course;
    private String grade;
    
    public Student(String username, String password, int studentNumber,
            String course, String grade){
        super(username, password);
        this.studentNumber= studentNumber;
        this.course = course;
        this.grade = grade;
    }
    
    public String getCourse(){
        return course;
    }
    
    public void changeGrade(String newGrade){
        this.grade = newGrade;   
    }
    
    public String getGrade(){
        return grade;
    }

}
