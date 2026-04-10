import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);    //scanner is scanner object


        double pi=3.14;
        String shape;
        double area;

        System.out.println("Choose a type of shape.(circle(c), rectangle(r) , squart(s))");
        shape = scanner.nextLine();

        if( shape.equals("c")){
            System.out.println("Please type the radius of the circle.");
            double r = scanner.nextDouble();

            area = pi * Math.pow(r,2);
            System.out.println("The area of "+shape+" is: " +area);
        }else if( shape.equals("r")){

            System.out.println("Please type the long edge of the rectangle.");
            double loEdge= scanner.nextDouble();
            System.out.println("Please type the short edge of the rectangle.");
            double shoEdge= scanner.nextDouble();

            area = loEdge * shoEdge;
            System.out.println("The area of "+shape+" is: " +area);
        }else if( shape.equals("s")){

            System.out.println("Please type one of the edges of the squart.");
            double edge= scanner.nextDouble();

            area = Math.pow(edge,2);
            System.out.println("The area of "+shape+" is: " +area);

        }else{
            System.out.println("This shape is not existing in my database.");
        }

        scanner.close();

    }
}
