import java.io.*;
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
        return mainFile;
    }

}
