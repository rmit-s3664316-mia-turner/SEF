import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class FileHandlerTest {

    @Test
    public void testFileChecker() {
        String main = "main.txt";
        String backup = "backup.txt";
        String file = FileHandler.fileChecker(main, backup);
        //System.out.println(file);
        
        assertEquals(main, file);
        
    }
    //test that course list is succesfully read in
    //checking that "History" is read into course name of first course
    @Test
    public void testReadingIn(){
        ArrayList<Course> courseList = new ArrayList<Course>();
        String file = "main.txt";
        
        FileHandler.readInCourses(courseList, file);
        
        assertEquals(courseList.get(0).getCourseName(), "History"); 
        
    }

}
