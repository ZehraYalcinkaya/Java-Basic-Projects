public class AccountManager {
    private double balance;

    public void deposit(double amount) //hesaba para yatırma işlemi
    {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException //hesaptan para çekme
    {//Hesap: -10 göstermemeli
        if (balance>=amount) {
            balance = getBalance() - amount;
        }
        else{
            //System.out.println("Hesaptan para çekilemedi. Bakiye yetersiz.");   1. yöntem
            //throw new Exception("Bakiye yetersiz");
            //YADA özel exception yazarız:
            throw new BalanceInsufficentException("Bakiye yetersiz.");
        }


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
