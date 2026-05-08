import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //Number Guessing Game

        Scanner scanner =new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts=0;
        int min =1;
        int max = 100;
        int randomNum = random.nextInt(min,max+1);    //from 1 to 10

        System.out.println("NUMBER GUESSİNG GAME");
        System.out.printf("Guess a number between %d-%d: ", min , max);

        do{
            System.out.println("\nEnter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNum){
                System.out.println("BIGGER!");
            }
            else if(guess > randomNum){
                System.out.println("SMALLER!");
            }

        }while(guess!= randomNum);

        System.out.println("You have won!!");
        System.out.println("# of attempts: "+ attempts);

        scanner.close();
    }
}
