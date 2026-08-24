public class ProductManager {
    public void add(Product product)
    {
       // ProductValidator validator = new ProductValidator();
        // ProductValidator'u newlemeden direkt araç olarak kullanabiliriz.

        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi.");
        }else {
            System.out.println("Eklenemedi.");
        }


        //-----------
        //constructorlar newleyince çalışır:

       // ProductValidator.bisey(); ---> ERROR

        ProductValidator productValidator = new ProductValidator();
        //newlenme constructoru da çalıştırır.
        productValidator.bisey();// bu method *static olmadığından* newlendikten sonra çalışır.

    }
}
