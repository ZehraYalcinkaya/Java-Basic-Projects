public class Main {

    public static void main(String[] args)
    {
        ProductManager manager = new ProductManager();
        Product product =new Product();

        product.price = 10;
        product.name = "Mouse";

        manager.add(product);


        //bu şekilde inner class ile de kullanılabilir ama doğru değil.
        //mesela ileride sadece crud kısmı gerektiğinde mecburen connection kısmıyla da ilgilenmek gerekecek.
        DatabaseHelper.Crud.Delete();

    }
}
