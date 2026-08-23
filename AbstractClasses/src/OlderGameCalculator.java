public class OlderGameCalculator extends GameCalculator{
    @Override
    public double calculateScore(int baseTotal) {
        return baseTotal*1.05;
    }
}
