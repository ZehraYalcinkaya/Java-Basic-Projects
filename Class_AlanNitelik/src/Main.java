public class Main {
    public static void main(String[] args){

        Product product2= new Product(2,"PC","Masaüstü bilgisayar", 30.000,200,"black", "465"); // ----> böyle de tanımlanabilir
        Product product= new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Bir dizüstü bilgisayar.");
        product.setPrice(50.000);
        product.setStockAmount(100);
        product.setCode("312");
        product.setColor("Blue");

        productManager.Add(product);
        System.out.println("Id: "+ product.getId());
        System.out.println("Name: "+ product.getName());
        System.out.println("Description: "+ product.getDescription());
        System.out.println("Price: "+ product.getPrice());
        System.out.println("StockAmount: "+ product.getStockAmount());
        System.out.println("Code: "+ product.getCode());
        System.out.println("Color: "+ product.getColor());


        productManager.Add(product2);
        System.out.println("Id: "+ product2.getId());
        System.out.println("Name: "+ product2.getName());
        System.out.println("Description: "+ product2.getDescription());
        System.out.println("Price: "+ product2.getPrice());
        System.out.println("StockAmount: "+ product2.getStockAmount());
        System.out.println("Code: "+ product2.getCode());
        System.out.println("Color: "+ product2.getColor());
    }
}
