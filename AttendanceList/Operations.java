package AttendanceList;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 

public class Operations {
    
    public static void appendList(File file, int no){
        try(FileWriter writer = new FileWriter(file ,true)){

            Scanner input =new Scanner (System.in);
            System.out.println("\nEnter the name of the student: ");
            String name = input.nextLine();
            writer.write(name + "\n");
            writer.close();
            System.out.println("\nSuccessfully appended to file.");
            input.close();
            } catch(IOException e){
                System.out.println("\nAn error occured.");
                e.printStackTrace();
            }
    }


    public static void showFile(File file){
        try(Scanner myReader = new Scanner(file)){
            System.out.println("\n\nThe attendance list is: \n");
            while(myReader.hasNextLine()){
                String data =myReader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("\nAn error occured.");
            e.printStackTrace();
        }
    }



    public static void removeFromList(){
            System.out.println("\nThis feature is not yet available.");
    }


    
    public static void deleteList(File file){
        if (file.delete()){
            System.out.println("\nDeleted file : " + file.getName());
        }else{
            System.out.println("\nFailed to delete the file.");
        }
    }
}
