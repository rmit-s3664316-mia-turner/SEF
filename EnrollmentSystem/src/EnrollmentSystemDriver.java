import java.util.ArrayList;
import java.util.Scanner;

public class EnrollmentSystemDriver {
    
    
    public static void main(String[] args){
        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<Course> courseList = new ArrayList<Course>();
        Scanner inpt = new Scanner(System.in);
        String username, password;
        Student adam = new Student("adam2222", "pw", 1, "history101", "RNF");
        Student mabel = new Student("mabel", "pw", 2, "history101", "RNF");
        Student deana = new Student("de232", "pw", 3, "history101", "RNF");
        Lecturer katie = new Lecturer("history101", "katie33", "pw");
        userList.add(adam);
        userList.add(mabel);
        userList.add(deana);
        userList.add(katie);
        
        
        

        int userRef = -1;
        while (userRef<0){
            
            System.out.println("enter username:");
            username=inpt.nextLine();
            System.out.println("enter password:");
            password=inpt.nextLine();
            userRef=checkLogin(username, password, userList);
    
        }
        
        System.out.println("Welcome " + userList.get(userRef).getUsername());
        
        if (userList.get(userRef) instanceof Student){
            //student menu
            
        }
        else if (userList.get(userRef) instanceof Lecturer){
            
            //do differnt shit
        }
        
 
        
        
    }
    
    
    public static int checkLogin(String username, String password, ArrayList<User> list){
        
        for (int i=0; i<=(list.size()-1); i++){
            if (username.equals(list.get(i).getUsername())){
                if (password.equals(list.get(i).getPassword())){
                    System.out.println("found a match");
                    return i;
                }
            }     
        }
        
        System.out.println("error, please try again");
        return -1;
    }

}
