public class Main {
    public static void main(String[] args){

        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log mesajı!");*/

        /*alternatif:

        BaseLogger[] loggers= new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};*/

        //Or

        FileLogger fileLogger = new FileLogger();
        EmailLogger emailLogger = new EmailLogger();
        DatabaseLogger databaseLogger = new DatabaseLogger();

        /*BaseLogger[] loggers = new BaseLogger[]{fileLogger,emailLogger,databaseLogger};
        for(BaseLogger logger : loggers)
        {
            logger.log("Log mesajı");
        }*/

       // __________________________________________________

        CustomerManager customerManager = new CustomerManager(fileLogger); // değişim olduğunda sadece burayı değiştirmek yeterli olacak.
        customerManager.add();

    }
}
