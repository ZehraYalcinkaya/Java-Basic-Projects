public class Main {
    public static void main(String[] args)
    {
        // farklı müşterilerin kullandığı veritabanlarına( farklı kodlar) uygun sistemlere ihtiyaç olur.
        CustomerManager customerManager=new CustomerManager();


        //customerManager databaseManageri Oracle olarak kullanacak.(oracle'ı verdik)
        customerManager.databaseManager = new OracleDatabaseManager();  //ileride değişiklik olunca sadece burayı değişmek yeterli olacak.


        customerManager.getCustomers();
        /// !!!!! OLMAZ !!!!!
        //customerManager.databaseManager.getCustomers(); ------> databaseManagerin getcustomer diye methodu yok!!!
    }
}
