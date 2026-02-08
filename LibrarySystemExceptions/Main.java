package LibrarySystemExceptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String[] books= new String[]{"Küçük Prens", 
                                    "Maça Kızı", 
                                    "Keloğlan", 
                                    "Nasrettin Hoca",
                                    "After"};

        int[] danger = new int[] {2,5};                    
         
        int length =  books.length;                                   

        Scanner myObj = new Scanner(System.in);
        LibraryOperations lib = new LibraryOperations(); //object

        System.out.println("\nEnter your name: ");
        String name = myObj.nextLine();

        System.out.println("\nEnter your age: ");
        int age = myObj.nextInt();
        myObj.nextLine(); // Clear buffer

        System.out.println("\nWill you borrow(1) a book or return(2) a book?");
        int BorR = myObj.nextInt();
        myObj.nextLine(); // Clear buffer

        try{
            lib.checkType(BorR);

        } catch (OutOfTypes e) {
            System.out.println("\nGiriş tipi bulunamadı: " + e.getMessage());
            System.out.println("\nKütüphane sistemi kapatildi.");
            myObj.close();
            System.exit(1);
        }

        lib.logIn(name, age, BorR);

        if(BorR==1){
            int book= lib.chooseBook(books, myObj);

          try {
            lib.checkEligibity(age);
            lib.checkIdx(book, length);
            
           
            
            System.out.println("\nİşlem başarıyla tamamlandı.");
        } 
          catch (AgeLimitException e) {
            if(lib.isDangerous(danger, book)){   //// Tehlikeli kitap kontrolü
                System.out.println("\nYaş uygun değil: " + e.getMessage());
                System.out.println("\nKütüphane sistemi kapatildi.");
                myObj.close();
                System.exit(1);
            } else {
                // Yaş tutmasa da, kitap danger listinde değilse OK
                System.out.println("\nİşlem başarıyla tamamlandı.");
            }
        }
          catch (NoBookIdx e) {
            System.out.println("\nKitap no bulunamadı: " + e.getMessage());
            System.out.println("\nKütüphane sistemi kapatildi.");
            myObj.close();
            System.exit(1);
        }
        } else {
            System.out.println("\nHow many days are you late?");
            int days = myObj.nextInt();

          try{
                lib.calculateLateFee(days);
                System.out.println("\nİşlem başarıyla tamamlandı.");
        } catch (IllegalArgumentException e) {

            System.out.println("\nHatalı gün sayısı: " + e.getMessage());
            System.out.println("\nKütüphane sistemi kapatildi.");
            myObj.close();
            System.exit(1);
        }
        }



    }
}
