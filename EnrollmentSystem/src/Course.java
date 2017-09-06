
public class Course {

    
    
    private String name;
    private String preReq[];
    private int maxStudents;
    private boolean currentlyOffered;
    private String exemptions[];
    
    public Course(String name, String preReq[], int maxStudents, 
            String exemptions[], boolean currentlyOffered){
        this.name = name;
        this.preReq= preReq;
        this.maxStudents= maxStudents;
        this.exemptions = exemptions;
        this.currentlyOffered = currentlyOffered;
    }
    
    public void printCourseDetails(){
        System.out.println("Course " + name + " has maxstudents " + maxStudents 
                + " and currently offered: " + currentlyOffered );
        
        System.out.println("Pre req list:");
        for (int i=0; i<(preReq.length); i++){
            System.out.println(i + ": " + preReq[i]);
        }
        
        System.out.println("exemption list:");
        for (int i=0; i<(exemptions.length); i++){
            System.out.println(i + ": " + exemptions[i]);
        }
        
    }
    
    
    public String getCourseName(){
        return name;
    }
    
    
    
}
