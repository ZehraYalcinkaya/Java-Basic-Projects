import java.util.Dictionary;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    { //bir anahtar kelime gibi çalışır.
        HashMap<String ,String> dictionary = new HashMap<String,String >();//tipler aynı olmak zorunda değil.

        dictionary.put("book","kitap");
        dictionary.put("computer","bilgisayar");
        dictionary.put("fan","vantilatör");

        System.out.println(dictionary);

        //direct for each ile gezilemez hashmapler
        //AMA
        for(String item : dictionary.keySet())
        {
            System.out.println("Eleman-"+" "+item+ " Değer-"+dictionary.get(item));
        }

        System.out.println(dictionary.size()); //sözlükteki eleman sayısını verir.

        System.out.println(dictionary.get("book"));  //sol taraf anahtar iken sağ taraf değerdir. (index yerine değer kullanılır)

        dictionary.remove("book");
        System.out.println(dictionary);
        System.out.println(dictionary.get("book")); //null ---> artık book'un bir karşılığı yok

        dictionary.clear();//sözlüğü tamamen siler
        System.out.println(dictionary); //null


    }
}
