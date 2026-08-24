import Matematik.*;
import java.util.Scanner;  //scanner javada bir built-in pakettir.

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);//pakete ne yapacağını belirttik.

        System.out.println("Adınız: ");

        String isim = scanner.nextLine();//sonraki satırı girdi olarak alır.

        System.out.println("Merhaba "+ isim +"!");
//---------------------KENDİ PAKETİMİZİ OLUŞTURMA----------------------
        int sayi1= 15;
        int sayi2=12;
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(sayi1,sayi2));
        System.out.println(dortIslem.cikar(sayi1,sayi2));
        System.out.println(dortIslem.bol(sayi1,sayi2));
        System.out.println(dortIslem.carp(sayi1,sayi2));
    }
}
