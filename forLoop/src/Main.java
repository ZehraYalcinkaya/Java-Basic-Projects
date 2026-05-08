import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        //for loop = execute some code a CERTAİN amount of time

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to count down from?: ");

        int start = scanner.nextInt();

        for (int i = start ; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); // mili seconds
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
