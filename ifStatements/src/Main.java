import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        //if statement performs a block of code if the conditition is true


        Scanner scanner = new Scanner(System.in);

        int age;
        String name ;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name= scanner.nextLine();

        System.out.println("Please type your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student?(true/false) : ");
        isStudent=scanner.nextBoolean();

        //Group1= checks name

        if(name.isEmpty()){
            System.out.println("\nzehraYou didn't enter your name!!!!!");
        }else{
            System.out.println("\nHello "+ name +"!");
        }


        //Group2= checks age

        if(age >= 50){
            System.out.println("You are an adult!");
        }
        else if(age >= 18){
            System.out.println("You haven't been born yet!");
        }
        else if( age ==0){
            System.out.println("You have just born!");
        }
        else{
            System.out.println("You are a child !");
        }


         //Group3= checks if it is a student or not

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You aren't a student.");
        }


        scanner.close();
    }
}
