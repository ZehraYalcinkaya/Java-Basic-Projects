import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ternary operator (?) = return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        int score;

        /*                                                       *
        if(score >= 60){                                         *
            System.out.println("PASS");                          *
        }else{                                                   *         these are the same
            System.out.println("FAIL");                          *
        }                                                        *
        */                                                     //*
                                                               //*
        //INSTEAD                                                *

        System.out.println("Enter your score : ");
        score =scanner.nextInt();
                                                               //*
        String variable = (score >= 60)? "PASS" : "FAIL";      //*
        System.out.println(variable);                          //*



        //Is umber even ?
        int number ;

        System.out.println("\n\nEnter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number%2 == 0) ? "EVEN" : "ODD";
        System.out.printf("The number %d is %s.",number , evenOrOdd);


        //military hours

        int hours;

        System.out.println("\n\nWhat time is it? (hours) :");
        hours = scanner.nextInt();

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(hours+" "+timeOfDay);




        scanner.close();
    }
}
