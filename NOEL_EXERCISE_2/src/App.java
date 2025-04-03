import java.io.File;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
    
        String user, pass, fileData;

        //USER AND PASS IS 
        // user: jared pass: noel | user: wan pass: two

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

            dataScientist data1 = new dataScientist(null, 0, "john");
            Researcher res1 = new Researcher(null, 0, "jane");
            Car elecCar = new Car(6, "10kwh");

            System.out.println("\nMy name is " + data1.name + ", I work as a " + data1.getWork() + " and he earns " + data1.getSalary());
            System.out.println(data1.name + " uses a " + elecCar.getBattery() + " electric car with " + elecCar.getCylinder());
            System.out.println("\nMy name is " + res1.name + " I work as a " + res1.getWork() + " and he earns " + res1.getSalary());
        }

        else{
            System.out.println("\nUNSUCCESSFUL LOGIN PLEASE TRY AGAIN....");
        }

        filesScanner.close();
        sc.close();
    }
}
