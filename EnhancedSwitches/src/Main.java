import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            //Enhanced switch = a replacement to many else if statements
            //                 (Java14 feature)



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day name: ");
        String day = scanner.next();



        switch(day.toUpperCase()){
            case "MONDAY" -> System.out.println("It is a weekday ");     //or >>> case "MONDAY", "TUESDAY"..... -> System.out.println("It is a weekday ");
                                                                             // because the output will be the same
            case "TUESDAY" -> System.out.println("It is a weekday ");

            case "WEDNESDAY" -> System.out.println("It is a weekday ");

            case "THURSDAY" -> System.out.println("It is a weekday ");

            case "FRİDAY" -> System.out.println("It is a weekday ");

            case "SATURDAY" -> System.out.println("It is the weekend ");

            case "SUNDAY" -> System.out.println("It is the weekend ");

            default -> System.out.println("This is not even a day");
        }


        scanner.close();
    }
}
