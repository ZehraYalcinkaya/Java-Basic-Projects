public class factorialCalculate{
    public static void main(String[] args) throws InterruptedException{  //to run 15th row

        int num=5;
        int fact=1;
        int preFact;
        
        System.out.println("Hesaplaniyor...");

        for(int i= 1; i<=num; i++){
            
            preFact=fact;
            fact*=i;
            System.out.println(i+". adim:" +preFact +"*"+ i +"="+fact);
            Thread.sleep(1000); // just to make wait for 1 sec
        }

        System.out.println("Factorial of: "+ num +"="+ fact );
    }
}