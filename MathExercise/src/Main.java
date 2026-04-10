import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //HYPOTENUSE   c= Math.sqrt(a^2 + b^2)   (c is hypotrnuse)

        Scanner scanner = new Scanner(System.in);


        double a;
        double b;
        double c;

        System.out.println("Enter the lenght of side A : ");
        a= scanner.nextDouble();

        System.out.println("Enter the lenght of side B : ");
        b= scanner.nextDouble();

        c= Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse( side c ) is : "+ c + "cm.");

        scanner.close();
    }
}
