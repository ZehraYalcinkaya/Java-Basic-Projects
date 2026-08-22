public class Main {
    public static void main(){
        Calculator calculator = new Calculator();

        int num1 = 12;
        int num2 = 45;
        int num3 = 23;

        System.out.println("num2 + num3 = "+ calculator.Add(num2,num3));
        System.out.println("num1 + num2+ num3 = "+ calculator.Add(,num1,num2,num3));
    }
}
