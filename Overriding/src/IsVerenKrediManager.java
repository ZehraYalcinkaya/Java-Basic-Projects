public class IsVerenKrediManager extends BaseKrediManager{
    public final double calculate(double amount)  //final----> ezilemez yani bir daha üstüne başka bir kod yazılamaz.
    {
        return amount*1.20;
    }
}
