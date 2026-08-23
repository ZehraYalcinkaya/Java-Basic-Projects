public class KidsGameCalculator extends GameCalculator{
    @Override
    public double calculateScore(int baseTotal) {
        return baseTotal * 1.10;
    }
}
