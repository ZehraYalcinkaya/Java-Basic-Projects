import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //WEIGHT CONVERSİON PROGRAM

        //declare variables

        Scanner scanner = new Scanner(System.in);

        double weight ;
        double new_weight;
        int choice;


        //welcome message

        System.out.println("WEIGHT CONVERSION PROGRAM");


        // promt for user input

        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice =scanner.nextInt();


        // option 1 convert lbs to kgs  (pounds to kilograms)
        if(choice==1){
            System.out.println("Enter the weight in lbs: ");
            weight =scanner.nextDouble();
            new_weight = weight * 0.453592;

            System.out.printf("New weight in kgs is %.2f.", new_weight);
        }

        // option 2 convert kgs to lbs

        else if (choice==2){
            System.out.println("Enter the weight in kgs: ");
            weight =scanner.nextDouble();
            new_weight = weight * 2.20462;

            System.out.printf("New weight in lbs is %.2f.", new_weight);
        }
        // else print : not a valid choice

        else{
            System.out.println("That was not a valid option!");
        }

        scanner.close();
    }
}
