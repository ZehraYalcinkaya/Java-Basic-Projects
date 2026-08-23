public class CustomerManager {

    BaseDatabaseManager databaseManager;  //= new OracleDatabaseManager();  yerine tek yerde değiştirilmesi yetecek (Main)

    public void getCustomers(){
       /// OracleDatabaseManager oracleDatabaseManager=new .....!!!! bağımlılık oluşturur!!!!
        databaseManager.getData();

    }
}
