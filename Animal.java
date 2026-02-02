abstract class Animal {
    
    public String livesWhere= "land";
    public int legs= 4;
    public abstract void abilities(String name, String detail);
}

class Pet extends Animal{

    public String color="white";

    @Override
    public void abilities(String name,String say){
        System.out.println("My "+ name+" say "+ say +" "+ say +" "+ say +" ");
    }
}


class Wild extends Animal{  /*  ***to use in the same file u need not to use 'public' */

    public boolean fear= true;
    @Override
    public void abilities(String name,String ableTo){
        System.out.println( name+"s can "+ ableTo);
    }
} 