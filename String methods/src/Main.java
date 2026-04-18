public class Main {
    public static void main(String[] args){

        String name = "fuck";

        int length = name.length();
        char letter = name.charAt(0); // what is the character at index 0?
        int index = name.indexOf("o");  // what is the index of this char?
        int lastIndex = name.lastIndexOf("o"); // where is the last "o"

        //name = name.toUpperCase();
         //name = name.toLowerCase();
        //name = name.trim();  // deletes the spaces before and after the string
        //name = name.replace("o","a"); // made the o's "a"

        /*
        if( name.isEmpty()){
            System.out.println("Your name is empty!");
        }else{
            System.out.println("Hello" + name);
        }
        */

        /*
        if(name.contains(" ")){  //if the string contains something
            System.out.println("Your name contains a space.");
        }else{
            System.out.println("Your name DOESN'T contains any spaces!");
        }
        */



       if(name.equals("fuck")){
           System.out.println("Your name can't be a bad word.");
       }else{
           System.out.println("Hello "+ name +"!!");
       }

    }
}
