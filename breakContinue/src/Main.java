import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* //break =breaks  out of a loop  (STOP)
        //continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++){

            if(i == 5){
                continue;
            }
            System.out.print(i +" ");
        }
        */


        //nested loop = A loop Used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

       int rows;
       int columns;
       char symbol;

        System.out.println("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the # of columns: ");
       columns = scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        System.out.println("\n\n");

        for(int j = 0; j < rows ; j++) {                    //a piramid
            for (int i = 1; i < columns-j; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
