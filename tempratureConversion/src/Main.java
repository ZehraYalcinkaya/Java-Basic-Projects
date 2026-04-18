import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temprature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celcius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();  // next* just to accept one char, nextLine accepts a line

        System.out.println(temp);
        System.out.println(unit);

        // (condition) ? true : false;
        newTemp= (unit.equals("C")) ?  (temp - 32) * 5/9 : (temp * 5/9) +32;
        System.out.printf("%.2f°%s",newTemp, unit);

        scanner.close();

    }
}
