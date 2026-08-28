import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        BufferedReader reader=null;

        int total =0;

        try {                                                                 //dosya
            reader = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\Desktop\\kod\\java\\ReadingFileDemo_Exceptions\\src\\numbers.txt")); //okuma türünü parametre olarak veririz.
            //önce dosyayı belleğe alıp oradan okumamıza yardımcı olan bir class.

            //reader sorunsu dosyayı sorunsuz açtı diye farz ediyoruz.
            String line  = null;
            while((line=reader.readLine()) != null) {//okuyacak satır varsa bir satır oku
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam: "+ total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try
            {
                reader.close(); //herhangi bir hataya karşı dosyayı okumaya çalışan thread'i kapatmalıyız.
            }
            catch (Exception exception){
                System.out.println(exception);
            }
        }
        //mutlaka try catchin içerisine alınmalı.
        //YA DA eğer alınmadan yazacaksak başında belirtmeliyiz ki kullanacak kişi try-catch kullansın
        //Public static void main(String[] args) -throws FileNotFoundException-{....}

    }
}
