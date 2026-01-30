public class SimpleCountdownMachine{
    public static void main(String[] args) throws InterruptedException{
      
      int secondsLast=5;
       
      while(secondsLast>0){
        System.out.println(secondsLast);
        Thread.sleep(1000);
        secondsLast--;
      }

      System.out.println("It's newyear !!!!!");

    }
}