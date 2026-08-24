import java.sql.SQLOutput;
import java.util.Scanner;  //scanner javada bir built-in pakettir.

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);//pakete ne yapacağını belirttik.

        System.out.println("Adınız: ");

        String isim = scanner.nextLine();//sonraki satırı girdi olarak alır.

        System.out.println("Merhaba "+ isim +"!");
    }
}
