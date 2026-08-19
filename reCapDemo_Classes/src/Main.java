public class Main {
    public static void main(String[] args){


        Calculator calculator = new Calculator();

        int number1 = 15;
        int number2 = 3;

        System.out.println("Result of add : "+ Calculator.Add(number1,number2));
        System.out.println("Result of subtract : "+Calculator.Subtract(number1,number2));
        System.out.println("Result of multiplication : "+Calculator.Multiplication(number1,number2));
        System.out.println("Result of divide : "+Calculator.Divide(number1,number2));

        System.out.println("Result of divide with zero : "+Calculator.Divide(number1,0));

    }
}
