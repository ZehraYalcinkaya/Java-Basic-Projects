public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){  //parametre vermeden direkt oluşturabilir.

    }

    public Customer (int id, String firstName, String lastName){ //parametreleri vererek oluşturabilir.
        this.id= id;
        this.firstName= firstName;
        this.lastName= lastName;
    }
}
