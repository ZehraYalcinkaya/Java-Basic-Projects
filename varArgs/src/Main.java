import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //varargs( variable arguements) = allow a method to accept a varying # of arguements
        //                                makes methods more flexible, no need for overloaded methods
        //                                java will pack the arguements into an array
        //                                .....(ellipsis)

        Scanner scanner = new Scanner(System.in);
        int numOfParameters;
        double[] parameters;


        System.out.print("How many numbers do you need? : ");
        numOfParameters = scanner.nextInt();

        parameters = new double[numOfParameters];


        for(int i= 0; i<numOfParameters ; i++){
            System.out.print("Type "+(i+1)+". parameter:");
            parameters[i] = scanner.nextDouble();
        }

        System.out.println(parameters);//gives the memory address

        System.out.printf("\n%.2f",add(parameters));
        System.out.printf("\n%.2f",avarage(parameters));


        //System.out.println(add(1,2,3,4,5));
        //System.out.println(avarage(1,2,3,5,4));

    }

    static double add(double... numbers){        //array of numbers (any numberr of variables)
        double sum= 0;//the numbers that ve parameter in to this method , method packs them into an array


        for (double num : numbers){
            sum +=num;
        }


        return sum;
    }

    static double avarage(double... numbers){

        double sum =0;

        if(numbers.length == 0)
            return 0;

        for( double num: numbers){
            sum += num;
        }

        return sum / (numbers.length);
    }
}
