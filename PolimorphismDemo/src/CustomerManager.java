public class CustomerManager {

    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }


    public void add()
    {    //!!!!!
        //DatabaseLogger logger = new DatabaseLogger();-------> Sürekli newlemek bizi bağımlı hale getirir, değişim gerektiğinde bu sistem direnir.
        System.out.println("Müşteri eklendi.");
        this.logger.log("Log mesajı");

    }
}
