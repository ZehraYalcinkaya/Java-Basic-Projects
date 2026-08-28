public class KronometreThread implements Runnable{

    private Thread t;
    private String threadName; //java bir threadi diğerinden ayırmak için onlara ayrı isim vermemizi ister

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep((1000));//ms cinsinden ,çok hızlı sayar.
            }
        } catch (InterruptedException e) {//bu thread bi şekilde bozulursa....
            System.out.println("Kesildi :" + threadName);
        }
        System.out.println("Thread bitti.");//threadin işlemi bitti.
        t.run();//thread'i başlat.
    }


        public void start(){
            System.out.println("Thread nesnesi oluşuyor.");

            if (t == null){
                t = new Thread(this,threadName); //1.= thread nesnesine konu olan class, 2.= thread'in ismi
                t.start();
            }

    }
}
