public class Main {
    public static void main(String[] args){

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new StudentKrediManager(),new TarımKrediManager(), new IsVerenKrediManager()};

        for (BaseKrediManager krediManager : krediManagers)
        {
            System.out.println(krediManager.getClass()+" : "+krediManager.calculate(1000));
        }

    }
}
