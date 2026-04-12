import java.util.Scanner;

public class Main {
    public static  void main (String[] args){

        Scanner scanner = new Scanner(System.in);


        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.90;

        System.out.println("Are you a 'student' ?(true / false) : ");
        isStudent = scanner.nextBoolean();

        System.out.println("Are you a ''senior' ?(true / false) : ");
        isStudent = scanner.nextBoolean();



        if( isStudent ){
            if( isSenior ){
                System.out.println("You get a senior discount of %20");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }else{
            if( isSenior ){
                System.out.println("You get a senior discount of %20");
                price *=0.8;
            }else{
                price *=1;
            }
        }

        System.out.printf("The price of a ticket is $%.2f", price);
    }
}
