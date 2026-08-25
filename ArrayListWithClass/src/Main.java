import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Zehra","Yalçınkaya"));
        customers.add(new Customer(2,"Ahsen","Özdemir"));
        customers.add(new Customer(3,"Sezgi","Öztürk"));


        for(Customer customer:customers){
            System.out.print(customer.firstName);
            System.out.print("\t");
        }
        System.out.println("\n");

        customers.remove(new Customer(1,"Dilşah", "Yalçınkaya"));//silinmez , her new dediğimizde yeni bir eleman oluşur.
        //Bu şekilde listeden eleman silinmez
        for(Customer customer:customers){
            System.out.print(customer.firstName);
            System.out.print("\t");
        }
        System.out.println("\n");

        //AMA
        //ona dışardan ulaşabileceğimiz bir referans verirsek..
        Customer Muhammet= new Customer(4,"Muhammet","Yalçınkaya");
        customers.add(Muhammet);

        for(Customer customer:customers){
            System.out.print(customer.firstName);
            System.out.print("\t");
        }
        System.out.println("\n");

        customers.remove(Muhammet);

        for(Customer customer:customers){
            System.out.print(customer.firstName);
            System.out.print("\t");
        }

    }
}
