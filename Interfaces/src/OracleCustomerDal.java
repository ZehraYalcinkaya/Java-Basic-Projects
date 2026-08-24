public class OracleCustomerDal implements ICustomerDal,IRepository{
    @Override    //Birden fazla interface implemente edebilir.
    public void Add() {
        System.out.println("Oracle ile çalıştı.");
    }
}
