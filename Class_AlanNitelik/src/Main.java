public class Main {
    public static void main(String[] args){

        Product product= new Product();
        ProductManager productManager = new ProductManager();

        product.id =1;
        product.name = "Laptop";
        product.description ="Bir dizüstü bilgisayar.";
        product.price = 50.000;
        product.stockAmount =100;

        productManager.Add(product);
    }
}
