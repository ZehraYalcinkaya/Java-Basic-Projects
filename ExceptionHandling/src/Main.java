public class Main {
    public static void main(String[] args){
        String city= "Ankara";
        int num;
        // num = city; ERROR yazarken kullanıcı bu hatayı alır.Derlenmez.
        // Ancak hata yönetimi ile yönettiğimiz hatalar için uygulama çalışır derlenir fakat çalışma anında hata verir.

        int[] numbers = new int[]{1,2,3};
        System.out.println(numbers[5]); //dışına çıktı diye hata verir

        //---------AMA---------
        try  //içerdeiki kodu çalıştırmayı dene
        {
            int numbers2 = new int[]{1,2,3};
            System.out.println(numbers2[5]);
        }
        catch(StringIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch(Exception exception) //yukarıda yakalanan hata catch bloğuna parametre olarak verilir.
        {
            System.out.println("Hata oluştu! Loglandı");
        }   // if-else gibi ya try çalışır ya catch kısmı
        finally {
            System.out.println("This will work anyway.");  //hata alsakda almasakda bir dosya açıldıysa kapanmalıdır.
        }//her türlü çalışır.

    }
}
