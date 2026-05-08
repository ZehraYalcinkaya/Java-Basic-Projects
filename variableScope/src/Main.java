public class Main {

    static int x = 3;

    public static void main(String[] args){

        //int x = 1; //LOCAL

        doSomething(); // will see the x in doSomething method
        System.out.println(x);
    }

    static void doSomething(){
        //int x= 2;

        System.out.println(x);
    }
}
