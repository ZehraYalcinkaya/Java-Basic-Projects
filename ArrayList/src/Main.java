import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int[] numbers = new int[]{1,2,3};
        numbers= new int[4];//üstteki sayılar gider ve bu artık yeni bir listedir, değerlerde default olarak 0'dır.
        System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]+" "+numbers[3]);


        //-------------------------------------------------
        // ARRAYLIST

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size()); // başta 0'dır

        sayilar.add(1); //yeni bir sayı ekler kaldığı indexten
        sayilar.add(10);
        sayilar.add("Ankara");//her türü kabul eder.
        System.out.println(sayilar.size());// kaç elemanlı olduğunu gösterir.

        sayilar.set(2,100); //2. indexe 100 atar.günceller de.
        System.out.println(sayilar.get(2));//2. indexteki değeri getirir.

        sayilar.remove(0);
        System.out.println(sayilar.get(0)); //silinen değer gider kalanlar onun yerine kayar.

        sayilar.clear();//tüm elemanları siler.
        //System.out.println(sayilar.get(1));//error , öyle bir sayi yok,artık liste yok




        sayilar.add(12);
        sayilar.add(45);
        sayilar.add("izmir");
        sayilar.add(78);
        sayilar.add("sandalye");
        sayilar.add(17);
        sayilar.add("zehra");
        sayilar.add(63);

        //Listeyi dolaşma
        //listede her türlü elemam türü olabileceği için "Object" ile gezilir.
        for(Object i:sayilar){
            System.out.print(i);
            System.out.print("\t");
        }

    }
}
