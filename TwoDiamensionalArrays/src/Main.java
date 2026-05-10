public class Main {
    public static void main(String[] args){
        //2D array= An array where each element is an array
        //          Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables= {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};


        String[][] groceries = {fruits, vegetables, meats}; //array of arrays  like we store all 3 array in just one line of array:)
                                                            //each row is an array

        //THE SAME:
        /*
        String[][] groceries = {{"apple", "orange", "banana"},
                               {"potato", "onion", "carrot"},
                               {"chicken", "pork", "beef", "fish"}};

        */

        groceries[0][0] = "pineapple";
        groceries[1][2] = "celery";
        groceries[2][1]="eggs";



        for (String[] foods : groceries){
            //System.out.println(foods); //memory addresses
            for(String food : foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }


        // TELEPHONE PROJECT

        char[][] telephone ={{'1','2','3'},
                             {'4','5','6'},
                             {'7','8','9'},
                             {'*','0','#'}};


        System.out.println( );
        for(char[] row : telephone){
            for(char num : row){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}
