public class WhichOne {
    
   public static void main(String[] args){


    Pet myCat = new Pet();

    System.out.println("My pets live on "+ myCat.livesWhere);
    System.out.println("My pets have "+ myCat.legs+ " legs.");
    

    myCat.abilities("cat", "meow");
    System.out.println("\nIt's color is "+myCat.color);


    Pet myDog = new Pet();

    
    myDog.color="black";
    myDog.abilities("dog", "wof");
    System.out.println("It's color is "+myDog.color+".");

    

    Wild wolf = new Wild();

    System.out.println("\nThey live on "+ wolf.livesWhere);
    System.out.println("They have "+ wolf.legs+ " legs.");
    
    System.out.println((wolf.fear)? "I am afraid of them. ": "I like them.");
    wolf.abilities("Wolf", "run very fast");
    
}

}