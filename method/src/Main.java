public class Main {
    public static void main(String[] args){

        //method=  a block of reusable code that is executed when called ()

        String first_name = "Zehra";
        String last_name = "Yalçınkaya";
        int age = 15;
        double num= 4;


        happyBirthday(first_name, age);
        System.out.println("Square : "+ square(num));
        System.out.println("Cube : "+ cube(num));
        System.out.println("Full name: " +getFullName(first_name,last_name));
        if(checkAge(age)){
            System.out.println("You're an adult");
        }else{
            System.out.println("You're still not an adult AHHAHHAHAAHAH");
        }

    }


    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!!");
        System.out.println("Happy Birthday dear "+name+"!!");
        System.out.println("You are "+age+" years old!");
        System.out.println("Happy Birthday to you!!");
    }
    static double square(double number){return number* number;}
    static double cube(double number){return number* number* number;}
    static String getFullName(String first_name,String last_name){return first_name+" "+last_name;}
    static boolean checkAge(int age){return (age>=18)? true: false;}
}
