import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        // username cannot contain spaces or underscores

        String username ;

        System.out.println("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("User name must be between 4 and 12 characters!!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores!!");
        }
        else{
            System.out.println("Welcome "+ username);
        }


        scanner.close();

    }
}
