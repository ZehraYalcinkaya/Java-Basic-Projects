import java.io.*;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args)  {
         createFile();
         getFileInfo();
         readFile();
         writeFile();
         readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\files\\Students.txt");

        try {
            if(file.createNewFile()){ //yoksa üretsin varsa uyarsın.
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //file.createNewFile(); //yeni dosya açar
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\files\\Students.txt");

        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya boyutu: " + file.length());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\files\\Students.txt");

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //dosya bulunamazsa
        }

    }

    public static void writeFile(){
        try {
            //Üzerine yazar öncekiler silinir
            //BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\files\\Students.txt"));

            //artık append yapma özelliği true
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\files\\Students.txt", true));
            writer.newLine(); //yeni satır oluştur öyle yaz.
            writer.write("Zehra"); //peşine yazdı : ZehraZehra
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
