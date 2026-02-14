package bufferedFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*; 
 


public class WriteABook{
    public static void main(String[] args){
        
        File file =new File("novel.txt");
        Scanner input =new Scanner(System.in);
        int choice= 0;

        try{
            if(file.createNewFile()){
                System.out.println("\nFile successfully created: "+ file.getName());
                Methods.bufferedWriter();
            }else{
                System.out.println("\nFile already exists.");
            }
        }catch(IOException e){
            System.out.println("\nAn error occured.");
            e.printStackTrace();
        }

        
    
        while(choice != -1){

            System.out.println("\nWhat do you want to do with your file?");
            System.out.println("\nto write(1), to read(2), to append(3), to quit(0)");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case -1:
                    System.out.println("Goodbye!");
                    break;
                

                case 1:
                    Methods.bufferedWriter();
                    break;

                case 2:
                    Methods.bufferedReader();
                    break;

                case 3:
                    System.out.println("\nEklemek istediğin line'ı yaz lütfen.\n");
                    String line = input.nextLine();

                    Methods.appendFile(line);
                    break;
            }

        }
        input.close();
        
    }
}
