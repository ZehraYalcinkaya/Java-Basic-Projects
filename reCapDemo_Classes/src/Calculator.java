public class Calculator {

    public static int Add(int num1, int num2)
    {
        return num1 + num2;
    }

    public static int Subtract(int num1, int num2)
    {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2)
    {
        return num1 * num2;
    }

    public static int Divide(int num1, int num2)
    {
        if (num2==0)
        {
            System.out.println("Bölen '0' olamaz!");
            return 0;
        }

        return num1 / num2;
    }
}
