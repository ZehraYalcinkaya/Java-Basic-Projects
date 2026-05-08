import java.util.Arrays;

public class Main {
    public static  void main(String[] args){


        String[] fruits = {"apple", "orange", "banana","coconut"};

        //fruits[0] = "pineapple";

        int numOfFruits = fruits.length;

        System.out.println(fruits); // gives a memory address

       /* for( int i = 0; i< numOfFruits; i++){
            System.out.println(fruits[i]);
        }

        */

        //enhanced for loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        System.out.println("\n\nAfter fll*ing");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
