public class lowestAge{
    public static void main(String[] args){

        int ages[] = {20,15,89,4,53,17};
        int length= ages.length;

        int lowestAge=ages[0];
        
        int i; // to keep track of indexes

        for( i= 0 ; i < length ; i++){
             
             if( ages[i] <lowestAge){
                lowestAge = ages[i];
             }
        }
        
        System.out.println("The lowest age in this array is "+ lowestAge + " at the index of "+i);
    }

}