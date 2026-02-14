package bufferedFile;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException; 
import java.io.*; 

public class Methods {
    
    static void bufferedWriter(){
           try(BufferedWriter bw = new BufferedWriter (new FileWriter("novel.txt"))){
            bw.write("******HEADER****");
            bw.newLine();
            bw.write("Once upon a time...");
            System.out.println("Successfully wrote to the file.");
           }catch(IOException e){
            System.out.println("An error occured while writing file!");
           }
     }

    static void bufferedReader(){
           try(BufferedReader br = new BufferedReader (new FileReader("novel.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
           }catch(IOException e){
            System.out.println("An error occured while reading file!");
           }
     }
    

    static void appendFile(String line){
           try(BufferedWriter bw = new BufferedWriter (new FileWriter("novel.txt", true))){
            bw.newLine();
            bw.write(line);
           }catch(IOException e){
            System.out.println("An error occured while reading file!");
           }
     }
}
