public class Main {
    public static void main(String[] args)
    {
        /*ICustomerDal customerDal = new ICustomerDal() {
            @Override
            public void Add() {

            }
        }*/    //Aynen abstract classlarda olduğu gibi newlenemezler
        // Ama:

        ICustomerDal customerDal = new OracleCustomerDal();
        // bu şekilde interface onu implemente eden classı tutabilir

// -----------------------------------------------------------
        //THIS
        //bunu kullanmak için CustomerManager'daki CustomerManager methodu kaldırılmalı
        /* CustomerManager customerManager= new CustomerManager();
        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add(); */

        //OR THAT
        //bu kısmı programcı vermeyi unutmasın diye CustomerManager methodunu ekledik.
        // customerManager.customerDal = new MySqlCustomerDal(); -----> artık customerDal private olduğu için bu kısmı kullanamayız.
        //artık şöyle olmalı:
        CustomerManager customerManager1= new CustomerManager(new OracleCustomerDal());
        customerManager1.add();
//-------------------------------------------------------------------------

    }
}
