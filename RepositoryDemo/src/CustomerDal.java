public class CustomerDal implements IEntityRepository<Customer>{//bunu Customer için oluşturacağım.
    //generic olmasına rağmen generic kullanmazsak object olarak gelir.
   /* ex: @Override
    public void add(Object entity) {
    }*/
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
