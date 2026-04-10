import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        // compound interest calculator    A=P[ 1 + r/n ]^nt

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;


        System.out.println("Enter the principal amount : ");
        principal =scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.println("Enter the # of times compounded per year  : ");
        timesCompounded= scanner.nextInt();

        System.out.println("Enter the # of years : ");
        years= scanner.nextInt();


        amount = principal * Math.pow(1+ (rate/100) / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " is: $" + amount);

        scanner.close();

    }
}
