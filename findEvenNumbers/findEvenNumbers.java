public class findEvenNumbers{
    public static void main(String[] args){

        int from=2;
        int to=10;

        for(int i=from; i<=to ; i+=2){
            if(i % 2 == 0){
                System.out.println(i);
            }else{
                i++;
                System.out.println(i);
            }
        }
    }
}