public class ProductValidator {
    //Araç olarak kullanacağımız yapılarda static kullanabiliriz.
    //static bir aracı bir kere oluşturur ve herkes onu böylece kullanabilir.
    //static tanımladığımızda bellekten uygulama sıfırlanana kadar bellekten atılmaz.(Newlediğimizde program sonlandığında atılıyordu.)
    //ilk kullanan kullanıcının çağırması ile nesne  oluşur ondan sonraki tüm kullanıcılar aynı nesneyi kullanır.
    //eğer içerisinde bir değişken varsa biri değiştirdiğinde herkes aynı değeri görür.
    //Yapıcı blok(constructor) tanımlanırsa  o blok newleyince çalışır.
    //----->
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }


    //static tanımlanan bloklar newlenmedende çalışır.
    static {
        System.out.println("Static blok çalıştı.");
    }
    public static boolean isValid(Product product)
    {
          if(product.price > 0 && !product.name.isEmpty()){
              return true;
          }
          else{
              return false;
          }
    }

    public void bisey(){}
}
