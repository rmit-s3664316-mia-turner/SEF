

import JUnitTest.Student;
import JUnitTest.User;

public class Lecturer extends User {
    
    private String[] courseList;
    
    
    
    public Lecturer(String username, String password, String courseList[]){
        super(username, password);
        this.courseList = courseList;
    }
    
    public String[] getCourseList(){
        return courseList;
    }
    
    public boolean enterResults(Student student, String grade){
        
        student.changeGrade(grade);
        if (student.getGrade()==grade){
            return true;
        }
        else {
            return false;
        }
        
    }
    

}
