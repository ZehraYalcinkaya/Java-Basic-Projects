public class Main {
    public static void main(String[] args){

        //2 steps creating a vriable
        /* 1. declaration
           2. assignment
         */

        int age=21;
        int year=2026;
        int quantitiy= 1;
        double price= 99.454214846544;
        char grade= 'A';
        boolean isStudent= true;              //generally or more we use booleans in if or while statements.
        String name = "Zehra Yalçınkaya";


        System.out.println("Hello " + name);
        System.out.println("The year is : " + year);
        System.out.println("The year is : " + "year");
        System.out.println(price);
        System.out.println("The grade is: " + grade);

        if(isStudent){
            System.out.println("U r a student.");
        }else{
            System.out.println("U r not a student.");
        }

    }
}
