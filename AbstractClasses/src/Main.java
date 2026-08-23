public class Main {
    public static void main(String[] args)
    {   //Abstract classlar newlenemez!!!
        GameCalculator[] calculators = new GameCalculator[]
                {new KidsGameCalculator(),new ManGameCalculator(),new OlderGameCalculator(),new WomenGameCalculator()};


        for(GameCalculator calculator: calculators)
        {
            System.out.println(calculator.getClass()+" : "+calculator.calculateScore(10));
        }
    }
}
