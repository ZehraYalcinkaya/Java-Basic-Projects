public class Main {

    public static void main(String[] args){

        //////////////// VARIABLES //////////////

        String name = "Bro Code";
        int gta= 6;
        double pi= 3.14159;
        char gender= 'M';
        boolean isAdmin= true;


        /////////////// OUTPUTS /////////////////

        System.out.println("Hello "+ name );

        if(gender == 'M'){
            System.out.println("You are a man.");
        }else if(gender == 'F'){
            System.out.println("You are a woman.");
        }else{
            System.out.println("GAY");
        }

        System.out.println("You like GTA version " + gta+".");
        System.out.println("The value of PI is " + pi);

        if(isAdmin){
            System.out.println("You can change the settings.");
        }else{
            System.out.println("You cannot change the settings.");
        }
    }
}
