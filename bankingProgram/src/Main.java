import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //JAVA BANKING PROGRAM FOR BEGINNERS

        //DECLARE VARİABLES


        double balance=0;
        boolean isRunning = true;
        int choice;

        //DISPLAY MENU

        while(isRunning){
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Exit");
            System.out.println("******************");


            //GET AND PROCESS USER CHOICE

            System.out.println("Enter your choice (1-4):");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);

                case 2 -> balance+= deposit();
                case 3 -> {
                    balance-= withDraw(balance);
                    System.out.println("new balance: "+balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");


            }
        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        //showBalance();

        //deposit()

        //withDraw

        //EXIT MESSAGE

        scanner.close();
    }

    //showBalance

    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }


    //deposit()
    static double deposit(){

        double amount;

        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount< 0){
            System.out.println("Amount can't be negative!!");
            return 0;
        }else{
            return amount;
        }


    }

    //withDraw
    static double withDraw(double balance){

        double amount ;

        System.out.println("Enter amount to be withDrawn : ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount< 0){
            System.out.println("Amount can't be negative!!");
            return  0;
        }else {
            return amount;
        }

    }
}
