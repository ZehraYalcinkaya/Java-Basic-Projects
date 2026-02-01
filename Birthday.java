public class Birthday {
    
    int year;            //this
    String place;        //this
    String name;         //this
    
    public Birthday(String name){
        this(2005, "Tokat", name);
    }
     
    public Birthday(int year, String place, String name){
        this.year= year; //= year (comes from out of here)
        this.place= place;
        this.name= name;
    }

    public void printBirthday( int day, String month){
        System.out.println( name +"'s birthday is " + day +" of "+ month.toUpperCase() + " " + year + " " + place );
    }

    public static void main(String[] args){
        Birthday myBirthday = new Birthday("Zehra");
        Birthday someoneBirthday = new Birthday(1998, "Istanbul", "Sude");

        myBirthday.printBirthday(3, "August");
        someoneBirthday.printBirthday(2,"March");
    }
}
