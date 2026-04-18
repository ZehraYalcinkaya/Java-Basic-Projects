import java.util.Scanner;


public class Main {
    public static void main(String[] args){


        // substring() = a method used to extract aportion of a string
        //                string.substring(start, end)

        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email: ");
         email= scanner.next();


        String first_name = email.substring(0,email.indexOf("_"));
        String last_name = email.substring(email.indexOf("_")+1,email.indexOf("@")-2);
        String year = email.substring(email.indexOf("@")-2 ,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));


        System.out.println("Hello "+ first_name + " "+ last_name +"!");

        System.out.println("Your expected graduation year: " + year + "+5");

        System.out.println("School's domain is: " + domain);


    }
}
