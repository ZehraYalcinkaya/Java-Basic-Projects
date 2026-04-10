public class Main {
    public static void main(String[] args){


        //printf()= is a methof used to format output

        // %[flags][width][.precision][specifier-character]

        // [width]


        // 0= zero padding
        // number = right justified padding
        // negative number = left justified

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 150.5;
        boolean isEmployed = true;

        System.out.printf("\nHello %s", name);
        System.out.printf("\nYour name starts with the letter %c.", firstLetter);
        System.out.printf("\nYou are %d years old.", age);
        System.out.printf("\nYou are %d cm tall.", height);
        System.out.printf("\nEmployed : ", isEmployed);

    }
}
