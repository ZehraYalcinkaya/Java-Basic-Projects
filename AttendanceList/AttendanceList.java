package AttendanceList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class AttendanceList {
    public static void main(String[] args){
        
        int no = 0;
        File file = new File("studentList.txt");// create file object, globally
        try{
            if(file.createNewFile()){
                System.out.println("file created successfully: "+file.getName());
            }else{
                System.out.println("File already exists.");
            }
                 
        }
        catch(IOException e){
            System.out.println("An error occured: ");
            e.printStackTrace();
        }


        System.out.println ("\n****Welcome to the attendance list app*****\n");

        System.out.println("FILE FEATURES: ");

        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writeable: " + file.canWrite());
        System.out.println("Readable " + file.canRead());
        System.out.println("File size in bytes " + file.length());

        
        System.out.println("\n\nWhat do you want to do? \n\n");
        Scanner input = new Scanner(System.in);


        System.out.println("1. Append to the list");    
        System.out.println("2. Show the list");
        System.out.println("3. Remove from the list(maintaining yet)");
        System.out.println("4. Delete the list");
        System.out.println("->");

        
        int choice = input.nextInt();
        //input.nextLine(); // consume the newline character
        
        
        switch(choice){
            case 1:
                no++;
                Operations.appendList(file, no);
                break;
            case 2:
                Operations.showFile(file);
                break;
            case 3:
                Operations.removeFromList();
                break;
            case 4:
                Operations.deleteList(file);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        input.close();
    }    
}
