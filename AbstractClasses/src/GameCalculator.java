public abstract class GameCalculator {  //BASE
    public abstract double calculateScore(int baseTotal);  // bu sınıfı örnekleyen herkeste bu işlem olacak ama her biri kendine özel kodunu yazacak (ezecek/override).

    public final void gameOver()
    {
        System.out.println("Oyun Bitti!");    //bu sınıfı örnekleyen herkeste bu işlem aynı olacak ve ezilemez.
    }
}
