public class Main {
    public static void  main(String[] args){
        //Generic'leri öğrenmek için

        Validator validator= new Validator();
        Customer customer = new Customer();

        validator.validate(customer);
    }
}
