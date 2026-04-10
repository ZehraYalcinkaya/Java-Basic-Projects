import java.util.Scanner;

public class Main {
               //Who, with whom,where,how, what are they doing game (Turkish game)
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);


        String noun1;
        String noun2;
        String place;
        String adjective;
        String verb;

        System.out.println("Welcome to my mad lib game, \nin this game you need to give us some words then \nin the end they'll come together and make up a sentence.");
        System.out.println("\nGive us a noun (a name of someone or an animal):");
        noun1=scanner.nextLine();
        System.out.println("Give us a noun (a name of someone or an animal):");
        noun2=scanner.nextLine();
        System.out.println("Give us a place (anywhere with in,on,at):");
        place= scanner.nextLine();
        System.out.println("Give us adjective (in a way of doing something..(-ly)):");
        adjective=scanner.nextLine();
        System.out.println("Give us a verb (give it with the suffix -ing):");
        verb=scanner.nextLine();

        System.out.println("\n\n\n"+"The sentence:");
        System.out.println(noun1+ " and " + noun2 + " are " + verb +" "+ adjective+" "+ place +".");


        scanner.close();
    }
}
