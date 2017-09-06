import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FileHandler {
    
    
    
    public static String fileChecker(String mainFile, String backupFile){
        String file = "file";
        
        Scanner inpt = new Scanner(System.in);
        Scanner stream = null;
        //check for main file
        try{
            stream = new Scanner(new File(mainFile));
            System.out.println("Loading Data from File.");
            return mainFile;
        }
        catch(FileNotFoundException e){
        }
        
        try{
            stream = new Scanner(new File(backupFile));
            System.out.println("Main File not found. Loading from Backup File.");
            return backupFile;
        }
        catch(FileNotFoundException e){
        }
        
        //else create new file
        try {
            PrintWriter p = new PrintWriter(new FileOutputStream(mainFile));
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Backup not found either. Creating empty file");

        return mainFile;
    }
    
    
    
//Reads in Courses from fileName,
//Format: "coursename/currentlyOffered/preReq1,preRe2,etc/maxStudents/exemption1,etc"
    
    public static void readInCourses(ArrayList<Course> courseList, String fileName)
    throws InputMismatchException{
            Scanner inpt = null;
            
            //make sure file can be found
            try{
                inpt = new Scanner(new File(fileName));
            }
            
            catch(FileNotFoundException e){
                System.out.println("FNFEXCEPTION " + e);
                return;
            }
            inpt.useDelimiter("/");
            while (inpt.hasNextLine()){
                String courseName = inpt.next();
                boolean currentlyOffered = inpt.nextBoolean();
                String preReqs =inpt.next();
                int maxStudents = inpt.nextInt();
                String exemptions = inpt.nextLine();
                
                //remove delimiter from exemptions string
                exemptions=exemptions.substring(1);
                
                //convert to arrays
                String preReqsArray[] = preReqs.split(",");
                String exemptionsArray[] = exemptions.split(",");
                
                Course newCourse = new Course(courseName, preReqsArray, 
                        maxStudents, exemptionsArray, currentlyOffered);
                
                courseList.add(newCourse);
                
                newCourse.printCourseDetails();
            }
        
        
    }
    
    
    public static void readInUsers(ArrayList<User> userList, String fileName)
    throws InputMismatchException{
                    Scanner inpt = null;
                    
                    //make sure file can be found
                    try{
                        inpt = new Scanner(new File(fileName));
                    }
                    
                    catch(FileNotFoundException e){
                        System.out.println("FNFEXCEPTION " + e);
                        return;
                    }
                    inpt.useDelimiter("/");
                    while (inpt.hasNextLine()){
                        
                        String type = inpt.next();
                        String username = inpt.next();
                        String password = inpt.next();
                        
                        switch(type){
                        case "Lecturer":
                            String courses = (inpt.nextLine()).substring(1);
                            String coursesArray[] = courses.split(",");
                            //Lecturer newUser = new Lecturer(username, password, coursesArray[]);
                            break;
                        case "Admin":
                            String progCoord = (inpt.nextLine()).substring(1);
                            //Admin newUser = new Admin(username, password, progCoord);
                            break;
                            
                        
                        case "Student":
                            String studentName = inpt.next();
                            boolean specialPermission = inpt.nextBoolean();
                            String current = inpt.next();
                            String past =(inpt.nextLine()).substring(1);
                            
                            String currentArray[]= current.split(",");
                            String pastArray[]= past.split(",");
                            
                            //Student newUser = new....
                            break;
                        }
                                  
                        userList.add(newUser); 
                    } 
            }
            

}
