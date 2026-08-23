public class StudentKrediManager extends BaseKrediManager{
    @Override
    public double calculate(double amount)// hala base'e bağlı ama base'i ezdik ve istisna bir kampanya oluşturduk.
    {
        return amount*1.10;
    }
}
