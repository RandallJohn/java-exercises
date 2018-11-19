package exercises;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Alice {

    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);

        String line =  "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please pic a term to search");
        String searchTerm = in.next();


        if (line.toLowerCase().contains(searchTerm.toLowerCase()) ) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}

