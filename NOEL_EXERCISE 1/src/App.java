import java.io.File;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String user, pass, fileData;

        System.out.print("Enter your Username:");
        user = sc.nextLine();

        System.out.print("Enter your Password:");
        pass = sc.nextLine();

        User nagamit = new User(user, pass);

        System.out.println("\nuser: " + user + " \npassword: " + pass);

        File myFile = new File("info.txt");
        Scanner filesScanner = new Scanner(myFile); 
        
        if (myFile.exists()) {
            
            System.out.println("\nFile exists");
        }    

        Boolean accountexists = false;
        while (filesScanner.hasNextLine()) {
            fileData = filesScanner.nextLine();
            System.out.println(fileData);

            String user_file = fileData.split(",")[0];
            String pass_file = fileData.split(",")[1];

            if (user.equals(user_file) && pass.equals(pass_file)) {
                    accountexists = true;
                    break; 
            }    
        }

        if(accountexists){
            System.out.println("\nYou Have Successfully Login....");
            System.out.println("\nWELCOME " + nagamit.getUser() + "!");
        }
        else{
            System.out.println("UNSUCCESSFUL LOGIN PLEASE TRY AGAIN....");
        }

        filesScanner.close();
        sc.close();
    }
}
