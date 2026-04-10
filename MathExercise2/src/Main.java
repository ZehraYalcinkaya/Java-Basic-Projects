import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        //circumference of a circle = 2 * Math.PI * radius;
        //area of a circle = Math.PI * Math.pow(radius ,2);
        //volume (kürenin hacmi) = (4.0 / 3.0) * Math.PI * Math.pow(radius ,3);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius ,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius ,3);


        System.out.printf("\nThe circumference is : %.1fcm" , circumference);
        System.out.printf("\nThe area is : %.1fcm²" , area);
        System.out.printf("\nThe volume is : %.1fcm³" , volume);

        scanner.close();
    }
}
