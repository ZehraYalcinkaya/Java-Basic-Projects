import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //while loop = repeat some code forever
        //             while some condition remains true

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Enter Your age: ");
        age= scanner.nextInt();

        do{               //executes at least once even if the condition is correct
            System.out.println("Your age can't be negative!!");
            System.out.println("Enter your age: ");
            age= scanner.nextInt();
        }while( age< 0);

        System.out.println("You are "+ age + " years old.");

        scanner.close();

    }
}
