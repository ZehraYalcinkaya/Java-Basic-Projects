package LibrarySystemExceptions;

import java.util.Scanner;

public class LibraryOperations {   // kütüphane fonksiyonları

    public void checkEligibity(int age) throws AgeLimitException {
        if (age < 18) {
            throw new AgeLimitException("This book is not for your age!!");
        }
    }

    public void checkType(int type) throws OutOfTypes {
        if (type != 1 && type != 2) {
            throw new OutOfTypes("You entered a non acceptable value of type of transaction.");
        }
    }

    public void calculateLateFee(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Days must be greater than zero");
        }
        int fee = 50+ (10*days);
        System.out.println("Gecikme bedeli: " + fee + "TL");
    }


    public void checkIdx(int no, int length) throws NoBookIdx {
        if ( no <=0 || no > length) {
            throw new NoBookIdx("You went out of library, the book index you entered is not found!");
        }
    }


    public void logIn(String name , int age , int BorR){
        System.out.println("\nisim: " + name);
        System.out.println("yaş: " + age);
        System.out.println("Tür: " + (BorR == 1 ? "Borrow" : "Return"));
    }

    public int chooseBook(String[] library, Scanner scanner){

        for(int i=0; i<library.length; i++){
            System.out.println((i+1) +") "+ library[i]);
        }
        
        System.out.println("\nLütfen bir kitap seçiniz.");
        int bookIdx = scanner.nextInt();

        return bookIdx;
    }

    public boolean isDangerous(int[] dangerList, int chosenBook){
        for(int x : dangerList){
            if (x == chosenBook)
                return true;
        }
        return false;
    }
}
