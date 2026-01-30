public class calculateAvarage{
    public static void main(String[] args){

        int ages[] = {20,15,89,4,53,17};

        int avg;

        int sum=0;

        for(int age : ages){
            sum += age;
        }

        avg= sum / (ages.length);

        System.out.println("Avarage of the 'ages' array is "+avg);
    }
}