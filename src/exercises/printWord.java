package exercises;

public class printWord {
    public static void printWord(String[] words) {
        for (String i : words) {

            if (i.length() != 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String [] args) {
        String [] News = new printWord(
        News = "Value is below absolute zero");
        System.out.print(printWord(News));
    }
}