package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Lecturer;

public class LecturerTest {

    @Test
    public void testSetUp() {
        Lecturer sam = new Lecturer("history101", "sam11", "password");
        String courselist = sam.getCourseList();
        assertEquals("history101", courselist);
        
    }
    //test that only a lecturer can change results
    @Test
    public void testGradeEntry(){
        Lecturer sam = new Lecturer("history101", "sam11", "password");
        Student nicole = new Student("nicole12", "password", 123, "history101", "RNF");
        assertEquals(sam.getCourseList(), nicole.getCourse());
        assertTrue(sam.enterResults(nicole, "22"));
        
        
        
        
        
        
    }
}
